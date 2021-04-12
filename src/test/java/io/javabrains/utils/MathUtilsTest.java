
package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class MathUtilsTest {

    private MathUtils mathUtils;
    private CricketScorer cricketScorer;
    private Calculator calculator;
    private NameInverter nameInverter;



    @BeforeEach
    void initEach() {
        mathUtils = new MathUtils();
        calculator=new Calculator();
        nameInverter=new NameInverter();
    }

    @Nested
    class AddTest {
        @Test
        void testAddingTwoPositives() {
            assertEquals(2, mathUtils.add(1, 1),
                    "Add method should return the sum of two numbers");
        }

        @Test
        void testAddingTwoNegatives() {
            assertEquals(-2, mathUtils.add(-1, -1),
                    "Add method should return the sum of two numbers");
        }

        @Test
        void testAddingAPositiveAndANegative() {
            assertEquals(0, mathUtils.add(-1, 1),
                    "Add method should return the sum of two numbers");
        }
    }

    @Test
    void testMultiply() {
        assertAll(
                () -> assertEquals(0, mathUtils.multiply(1, 0)),
                () -> assertEquals(1, mathUtils.multiply(1, 1)),
                () -> assertEquals(6, mathUtils.multiply(2, 3))
        );
    }
@Test
    void testCheckPalidrome(){
        assertAll(
                ()->assertEquals(true,mathUtils.checkPalidrome("abba")),
                            ()->assertEquals(false,mathUtils.checkPalidrome("hello")),
                            ()->assertEquals(true,mathUtils.checkPalidrome("AABBBBBBBBAa"))
        );
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return right circle area");
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
                "Divide should throw ArithmeticException when denominator is zero");
    }

    @Test
    void testPasswordLength(){
        assertEquals(true,mathUtils.PasswordValidator("taslima26"));
    }

    @Test
    void testTwoSumsFunction(){
        int[] expectedOutput = {1,2,3,4,5};
        int[] methodOutput = {2,3};
       assertArrayEquals(methodOutput,mathUtils.twoSum(expectedOutput,5));
    }

    @Test
    void testReverseGivenInteger(){
        assertEquals(12345,mathUtils.reverseInteger(54321));
    }

    @Test
    void testRevereseForGivenNegativeInteger(){
        assertEquals(-12345,mathUtils.reverseInteger(-54321));
    }
    @Test

    void testCheckPalidromeNumber(){
        assertEquals(true,mathUtils.checkPalidromeNumber(121));
        assertEquals(false,mathUtils.checkPalidromeNumber(-12));
    }

    @Test
    void testcheckEnoughBrick(){
        assertEquals(true,mathUtils.enoughBrick(2,2,12));
        assertEquals(false,mathUtils.enoughBrick(6,2,18));
        assertEquals(false,mathUtils.enoughBrick(2,4, 14));
    }

    @Test
    void testRemoveDuplicates(){
        
        int[] expected={1,2,3,4};
        int[] provided={1,1,2,2,3,4};
        assertEquals((Arrays.asList(1,2,3,4)),mathUtils.removeDuplicates(provided),"not valid result");
    }

  @Test
    void emptyStringReturnsZero() throws Exception {
        assertEquals(0,calculator.addNumbers(""));
  }

  @Test
  void singleValueIsReplied() throws Exception {
        assertEquals(1,calculator.addNumbers("1"));
  }

  @Test
  void twoNumbersCommaDelimetersReturnsSum() throws Exception {
        assertEquals(3,calculator.addNumbers("1,2"));
  }
  @Test
  void twoNumbersSlashDelimetersReturnsSum() throws Exception {
        assertEquals(3,calculator.addNumbers(("1/n2")));
  }

  @Test
    void twoStringsAreAnagram() throws Exception{
        assertEquals(true,mathUtils.checkAnagram("Silent","Listen"));
  }

  @Test
  void giveAllPrimeNumbers() throws  Exception{

      ArrayList<Integer> expected = new ArrayList<Integer>();
      expected.add(2);
      expected.add(3);
      expected.add(5);
      expected.add(7);
      assertEquals(expected,mathUtils.checkPrime(1,10));
  }

@Test
  void invertNullThrowNullPointerException(){
      Assertions.assertThrows(NullPointerException.class, () -> {
          nameInverter.invert(null);

      });

  }

  @Test
  void invertEmptyStringShouldReturnEmptyString(){
        assertEquals("   ",nameInverter.invert(" "));
  }

  @Test
    void invertOnlyNameShouldReturnNameBack(){
        assertEquals("Taslima",nameInverter.invert("   Taslima"));
  }

  @Test
  void invertFirstCommaLastShouldReturnLastCommaFirst(){
        assertEquals("Banglawala,Taslima",nameInverter.invert("Taslima Banglawala"));
  }

    @Test
    void testExpectedException() {

        //First argument - specifies the expected exception.
        //Here it expects that code block will throw NumberFormatException
        //Second argument - is used to pass an executable code block or lambda expression
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            Integer.parseInt("One");
        });

    }
    @Test
    void invertTestHonourEffect(){
        assertEquals("Banglawala,Taslima",nameInverter.invert("Mrs Taslima Banglawala"));
    }




}
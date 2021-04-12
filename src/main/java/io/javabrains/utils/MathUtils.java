package io.javabrains.utils;

import java.util.*;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public boolean PasswordValidator(String password){
        return password.length() >= 3 && password.length() <= 10;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target) {
                  answer[0]=nums[i];
                  answer[1]=nums[j];
              }
            }
        }
        return answer;
    }

    public boolean enoughBrick(int small, int big, int target) {
        //it fails if there arent enough brick
        if ((small + 5 * big) > target) {
            return false;
        } else if (target % 5 < small) {
            return false;
        } else {
            return true;
        }
    }

    public  int reverseInteger (int input){
        //convert number to string

        //reverse the string
        //convert it back to array
        //if negative numbers ,extract the first character and append it to end
        StringBuilder numberString=new StringBuilder(Integer.toString(input));
        String reverseString=numberString.reverse().toString();
        if(reverseString.contains("-"))
            reverseString='-'+reverseString.substring(0,reverseString.length()-1);
        long l=Long.parseLong(reverseString);
        if(l<Integer.MIN_VALUE || l> Integer.MAX_VALUE)
            return 0;
        return (int)l;

    }

    public boolean checkPalidromeNumber(int number){
        //given a number
        return true;
    }
    public double computeCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    //check palidrome
    public boolean checkPalidrome(String input) {
        String inputLowerCase=input.toUpperCase();
        if (inputLowerCase.length() > 2) {
            int forward = 0;
            int backward = inputLowerCase.length() - 1;
            while (backward > forward) {
                char forwardChar = inputLowerCase.charAt(forward++);
                char backwardChar = inputLowerCase.charAt(backward--);
                if (forwardChar != backwardChar)
                    return false;
            }
        }
        return true;
    }

    public boolean checkAnagram(String input1, String input2) {
        boolean results =false;
        if (input1.length() == input2.length()) {
            char[] input1Array = input1.toLowerCase().toCharArray();
            char[] input2Array = input2.toLowerCase().toCharArray();
            Arrays.sort(input1Array);
            Arrays.sort(input2Array);
            System.out.println(input1Array);
            System.out.println(input2Array);
            results=Arrays.equals(input1Array,input2Array);
            System.out.println(results);


        }
        return results;

    }

    public ArrayList<Integer> checkPrime(int a, int b) {
        ArrayList<Integer> results = new ArrayList<>();
        int flag;
        for (int i = a; i <= b; i++) {
            System.out.println("i"+i);

            // Skip 0 and 1 as they are
            // niether prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                System.out.println("J"+j);
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
               results.add(i);
        }



        return results;
    }


    /*public String[] whichAreIn(String [] a,String [] b){
        //loop through array-a
        //loop throug array-b
        List<String> result = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i].contains(b[j]));
                {
                    result.add(a[i]);
                }
            }
        }
        System.out.println(result);
        String[] arrayUnsorted= result.toArray(new String[result.size()]);
        //perform sorting to sort arrayWithDuplicates
        Arrays.sort(arrayUnsorted);
        //calculate length of the sorted array
        int lenArray=arrayUnsorted.length;
        //integer variable to increment array index  length;
        int index=0;
        //use for loop to traverse the arrayWithDuplicates
        for(int i=0;i<lenArray;i++)
            //we will skip the index until there are duplicates ahead


        }

    }*/


}
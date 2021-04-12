package io.javabrains.utils;

public class Calculator {
    private final String delimeters=",|/n";
    public int addNumbers(String input) throws Exception {

        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return converToInt(input);
        } else {
            String[] numbers = input.split(delimeters);
            return getSum(numbers);

        }

    }
    private int getSum (String[]numbers) throws Exception {
            int sum = 0;
            for (String current:numbers) {
                if(converToInt(current)<0){
                    throw new Exception("negative input");
                }
                sum += Integer.parseInt(current);
            }
            return sum;
        }

        private boolean isEmpty (String input){
            if (input.isEmpty()) {

            }
            return true;
        }

        private int converToInt (String input){
            return Integer.parseInt(input);
        }

}

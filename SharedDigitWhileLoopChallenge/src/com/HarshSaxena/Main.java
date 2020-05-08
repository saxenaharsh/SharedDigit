package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
        // write your code here
        hasSharedDigit(12, 43);
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            System.out.println("Invalid number range");
            return false;
        }

        int firstNumFirstDigit = 0;
        int firstNumLastDigit = 0;
        int secondNumFirstDigit = 0;
        int secondNumLastDigit = 0;

        while (true) {
            if ((firstNumber >= 10) && (firstNumber <= 99) && ((secondNumber >= 10) && (secondNumber <= 99))) {
                firstNumLastDigit = firstNumber % 10;
                secondNumLastDigit = secondNumber % 10;
            }
            firstNumFirstDigit = firstNumber / 10;
            secondNumFirstDigit = secondNumber / 10;
            break;

        }
        if ((firstNumFirstDigit == secondNumFirstDigit) || (firstNumFirstDigit == secondNumLastDigit)
                || (firstNumLastDigit == secondNumFirstDigit) || (firstNumLastDigit == secondNumLastDigit)) {
            System.out.println(firstNumber);
            System.out.println(firstNumFirstDigit);
            System.out.println(firstNumLastDigit);

            System.out.println(secondNumber);
            System.out.println(secondNumFirstDigit);
            System.out.println(secondNumLastDigit);
            return true;

        }else{
            return false;
        }

    }
}



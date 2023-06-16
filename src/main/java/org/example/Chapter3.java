package org.example;

import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//
//        // Addition Quiz
//        int number1 = (int)(System.currentTimeMillis() % 10);
//        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
//
//        System.out.println("What is " + number1 + " + " + number2 + " ?");
//
//        int answer = input.nextInt();
//
//        if(answer == (number1 + number2))
//            System.out.println("You are correct");
//        else
//            System.out.println("Yor aren't correct. \nThe answer is " + number1 + number2);
//
//        // Subtraction Quiz
//        int num1 = (int)(Math.random() * 10);
//        int num2 = (int)(Math.random() * 10);
//        int temp;
//        if(num1 > num2){
//            temp = num1;
//            num1 = num2;
//            num2 = temp;
//        System.out.println("What is " + num1 + " - " + num2);
//            int answer2 = input.nextInt();
//            if(answer2 == (num1 - num2))
//                System.out.println("You are correct!");
//            else
//                System.out.println("Answer is " + (num1 - num2));
//        }
//
//        // Compute and interpret BMI
//        final double KG_PER_POUND = 0.45359237;
//        final double METERS_PER_INCHES = 0.0254;
//
//        System.out.println("Enter your weight in pounds:");
//        double weightInPounds = input.nextDouble();
//
//        System.out.println("Enter your height in inches:");
//        double heightInInches = input.nextDouble();
//
//        double weightInKgs = weightInPounds * KG_PER_POUND;
//        double heightInMeters = heightInInches * METERS_PER_INCHES;
//        double bmi = weightInKgs / (Math.pow(heightInMeters, 2));
//
//        System.out.println("BMI is " + bmi);
//        if (bmi < 18.5)
//            System.out.println("Underweight");
//        else if (bmi < 25)
//            System.out.println("Normal");
//        else if (bmi < 30)
//            System.out.println("Overweight");
//        else
//            System.out.println("Obese");
//
//        // Taxes
//
//        System.out.println("0 - single filler " +
//                "\n1 - married jointly or qualified widower" +
//                "\n2 - married separately," +
//                "\n3 - head of household " +
//                "\nEnter the filing status:");
//        int status = input.nextInt();
//
//        System.out.println("Enter the taxable income:");
//        double income = input.nextDouble();
//
//        double tax = 0;
//
//        switch(status){
//            case 0:
//                if(income <= 8_350)
//                    tax = income * 0.1;
//                else if(income <= 33_950)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15;
//                else if(income <= 82250)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
//                else if(income <= 171550)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (income - 82_250) * 0.28;
//                else if(income <= 372950)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28 + (income - 372_950) * 0.33;
//                else
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (82_250 - 33_950) * 0.25 + (171_550 - 82_250) * 0.28 + (372950 - 171_550) * 0.33 + (income - 372_950) * 0.35;
//                break;
//            case 1:
//                if(income <= 16_700)
//                    tax = income * 0.1;
//                else if(income <= 67_900)
//                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15;
//                else if(income <= 137_050)
//                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (income - 67_900) * 0.25;
//                else if(income <= 208_850)
//                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (income - 137_050) * 0.28;
//                else if(income <= 372_950)
//                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (income - 208_850) * 0.33;
//                else
//                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 + (income - 372_950) * 0.35;
//                break;
//            case 2:
//                if(income <= 8_350)
//                    tax = income * 0.1;
//                else if(income <= 33_950)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15;
//                else if(income <= 68_525)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (income - 68_525) * 0.25;
//                else if(income <= 104_425)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (income - 104_425) * 0.28;
//                else if(income <= 186_475)
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +  (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 + (income - 186_475) * 0.33;
//                else
//                    tax = 8_350 * 0.1 + (33_950 - 8_350) * 0.15 +  (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 + (186_475 - 104_425) * 0.33 + (income - 186_475) * 0.35;
//                break;
//            case 3:
//                if(income <= 11_950)
//                    tax = income * 0.1;
//                else if(income <= 45_500)
//                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15;
//                else if(income <= 117_450)
//                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (income - 45_500) * 0.25;
//                else if(income <= 190_200)
//                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (income - 117_450) * 0.28;
//                else if(income <= 372_950)
//                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 + (income - 190_200) * 0.33;
//                else
//                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 + (372_950 - 190_200) * 0.33 + (income - 372_950) * 0.35;
//                break;
//            default:
//                System.out.println("Enter a valid filing status value!");
//        }
//        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
//
//        //Leap Year
//        System.out.println("Program to check if a year is a leap year (has 366 days)");
//        System.out.println("Enter the year: ");
//        int year = input.nextInt();
//
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0);
//        System.out.println("The year " + year + " is a leap year. " + isLeapYear);
//
//        // Lottery
//        int lottery = (int)(Math.random() * 100);
//        int lotteryDigit1 = lottery / 10;
//        int lotteryDigit2 = lottery % 10;
//
//        System.out.println("Enter your lottery picks (two digits):");
//        int guess = input.nextInt();
//        int guessDigit1 = guess / 10;
//        int guessDigit2 = guess % 10;
//
//        System.out.println("The lottery: " + lottery);
//
//        if(lottery == guess)
//            System.out.println("Exact Match! You've won $10,000");
//        else if(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
//            System.out.println("Match all digits! You've won $3,000");
//        else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2)
//            System.out.println("Match one digit! You've won $1,000");
//        else
//            System.out.println("Sorry no match!");

        // Chinese Zodiac
        System.out.println("Enter the year you were born in:");
        int birthYear = input.nextInt();
        switch(birthYear % 12){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
        }








        input.close();
    }
}

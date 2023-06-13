package org.example;

import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Addition Quiz
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        System.out.println("What is " + number1 + " + " + number2 + " ?");

        int answer = input.nextInt();

        if(answer == (number1 + number2))
            System.out.println("You are correct");
        else
            System.out.println("Yor aren't correct. \nThe answer is " + number1 + number2);

        // Subtraction Quiz
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int temp;
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        System.out.println("What is " + num1 + " - " + num2);
            int answer2 = input.nextInt();
            if(answer2 == (num1 - num2))
                System.out.println("You are correct!");
            else
                System.out.println("Answer is " + (num1 - num2));
        }

        // Compute and interpret BMI
        final double KG_PER_POUND = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;

        System.out.println("Enter your weight in pounds:");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter your height in inches:");
        double heightInInches = input.nextDouble();

        double weightInKgs = weightInPounds * KG_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCHES;
        double bmi = weightInKgs / (Math.pow(heightInMeters, 2));

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        // Taxes

        //Leap Year

        // Lottery

        input.close();
    }
}

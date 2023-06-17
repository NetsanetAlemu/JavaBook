package org.example;

import java.util.Scanner;

public class Chapter3Question28 {
    public static void main(String[] args) {
        //Two Rectangles
        Scanner input = new Scanner(System.in);
        double x1, y1, height1, width1, x2, y2, height2, width2;

        System.out.println("Enter the first rectangles' " +
                "\nCenter x-, y-coordinates" +
                "\nWidth:" +
                "\nHeight:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        width1 = input.nextDouble();
        height1 = input.nextDouble();

        System.out.println("Enter the second rectangles' " +
                "\nCenter x-, y-coordinates" +
                "\nWidth:" +
                "\nHeight:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        width2 = input.nextDouble();
        height2 = input.nextDouble();

        // conditions to check if rectangle 2 is inside rectangle 1 or vice versa

        // 1. if center 2 is inside center 1 or vice versa
        // 2. if width 2 is less than width 1 or vice versa
        // 3. if height 2 is less than height 1 or vice versa

        // conditions to check if rectangle 2 overlaps rectangle 1 or vice versa
        // 1. if width 2 crosses width 1
        // 1. if width 2 crosses height 1
        // 1. if width 2 crosses height 2
        // 1. if height 2 crosses width 1
        // 1. if height 2 crosses width 2
        // 1. if height 2 crosses height 1

        input.close();
    }
}

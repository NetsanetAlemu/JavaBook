package org.example;

import java.util.Scanner;

public class Chapter3Question28 {
    public static void main(String[] args) {
        //Assuming the width of the rectangle is parallel to the x-axis, and height is parallel to y-axis
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

        double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1;
        double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1;

        if(xDistance <= (width1 - width2) / 2 && yDistance <= (height1 - height2) / 2)
            System.out.println("Rectangle 2 is inside Rectangle 1");
        else if(xDistance <= (width1 + width2) / 2 && yDistance <= (height1 + height2) / 2)
            System.out.println("Rectnagle 2 overlaps Rectangle 1");
        else
            System.out.println("Rectangle 2 doesn't overlap Rectnagle 1");

        input.close();
    }
}

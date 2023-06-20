package org.example;

import java.util.Scanner;

public class Chapter3Question29 {
    public static void main(String[] args) {
        // Two Circles
        Scanner input = new Scanner(System.in);

        double x1, y1, r1, x2, y2, r2;

        System.out.println("Enter the first circles' " +
                "\nCenter x-, y-coordinates" +
                "\nRadius:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        r1 = input.nextDouble();

        System.out.println("Enter the second circles' " +
                "\nCenter x-, y-coordinates" +
                "\nRadius:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        r2 = input.nextDouble();

        double xDistance = x1 >= x2 ? x1 - x2 : x2 - x1;
        double yDistance = y1 >= y2 ? y1 - y2 : y2 - y1;

        if(xDistance <= (r1 - r2) && yDistance <= (r1 - r2))
            System.out.println("Cirlce 2 is inside Circle 1");
        else if(xDistance <= (r1 + r2) && yDistance <= (r1 + r2))
            System.out.println("Circle 2 overlaps Circle 1");
        else
            System.out.println("Circle 2 doesn't overlap Circle 1");
        input.close();
        }
}

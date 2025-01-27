package org.example;

import java.util.Scanner;

public class Chapter3Question32 {
    public static void main(String[] args) {
        // Point position
        Scanner input = new Scanner(System.in);

        double x0, y0, x1, y1, x2, y2;

        System.out.println("Enter three points for p0, p1, and p2:");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        double status = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);;
        if(status > 0)
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from ("
                    + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else if(status == 0)
            System.out.println("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", "
                    + y0 + ") to (" + x1 + ", " + y1 + ")");
        else
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", "
                    + y0 + ") to (" + x1 + ", " + y1 + ")");
        input.close();

    }
}

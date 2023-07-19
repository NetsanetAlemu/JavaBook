package org.example;

import java.util.Scanner;

public class TestMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(max(a,b) + " is maximum of " + a + " and " + b);

        input.close();

    }
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
}

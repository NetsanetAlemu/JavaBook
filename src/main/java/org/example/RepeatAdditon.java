package org.example;

import java.util.Scanner;

public class RepeatAdditon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int sum = 0, count = 0;
        int i = 1;
        while (i <= 10) {
            int num1 = (int)(Math.random() * 15) + 1;
            int num2 = (int)(Math.random() * 15) + 1;
            System.out.println("What is " + num1 + " + " + num2 + " ?");
            int answer = input.nextInt();
            if (answer != num1 + num2)
                System.out.println("Wrong. Correct answer is " + (num1 + num2));
            else {
                count++;
                System.out.println("Correct answer count is " + count);
            }
            i++;
        }
        input.close();

    }
}

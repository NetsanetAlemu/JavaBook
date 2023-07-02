package org.example;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String s = input.next();

        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrome = true;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        if (isPalindrome)
            System.out.println(s + " is palindrome.");
        else
            System.out.println(s + " is not palindrome.");

        input.close();


    }
}

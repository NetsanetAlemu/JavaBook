package org.example;
import java.util.Scanner;
public class Chapter2 {
    public static void main(String[] args) {
      // Current time using UNIX epoch - january 1, 1970
        long totalMilliSec = System.nanoTime();
        long totalSeconds = totalMilliSec / 1000000000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalhours = totalMinutes / 60;
        long currentHours = totalhours % 24;

        System.out.println("Current time is " + currentHours + ":" +
                currentMinutes + ":" + currentSeconds + " GMT");
        // Sum the digits in an integer between 0 and 1000
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int number = input.nextInt();
        int sum = 0, digit = 100;
        for(int i = 0; i <= 2; i++){
            sum += number / digit;
            number = number % digit;
            digit /= 10;
        }
        System.out.println("Sum: " + sum);



    }
}

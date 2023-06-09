package org.example;

public class Chapter2 {
    public static void main(String[] args) {
      // Current time using UNIX epoch
        long totalMilliSec = System.nanoTime();
        long totalSeconds = totalMilliSec / 1000000000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalhours = totalMinutes / 60;
        long currentHours = totalhours % 24;

        System.out.println("Current time is " + currentHours + ":" +
                currentMinutes + ":" + currentSeconds + " GMT");


    }
}

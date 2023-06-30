package org.example;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10_000;
        int year = 0;
        while (tuition < 20_000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year);
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}

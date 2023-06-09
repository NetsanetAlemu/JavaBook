package org.example;

public class Chapter1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       // 1.11 population projection
        System.out.println("Current population: 312032486.0");
        System.out.println("One birth every 7 seconds");
        System.out.println("One death every 13 seconds");
        System.out.println("One new immigrant every 45 seconds");
//        System.out.println("Population 1 year later: " + (312032486.0 -
//                (312032486.0/ (7 * 365 * 24 * 3600) +
//                        (312032486.0/ (13 * 365 * 24 * 3600) +
//                                (312032486.0/ (45 * 365 * 24 * 3600))))));
        double currentPopulation = 312032486.0;
        double deathPerYear =  7 * 365 * 24 * 3600 ;
        double birthPerYear = 13 * 365 * 24 * 3600;
        double immigrantsPerYear = 45 * 365 * 24 * 3600;
        int counter = 1;
        while(counter <= 5){
            double currentDeath = currentPopulation / deathPerYear;
            double currentBirth = currentPopulation / birthPerYear;
            double currentImmigrants = currentPopulation / immigrantsPerYear;
            currentPopulation = currentPopulation - currentDeath + currentBirth
                    + currentImmigrants;
            System.out.println("Population " + counter + " year later is "
                    + currentPopulation);
            counter++;
        }

        // Algebra

    }
}
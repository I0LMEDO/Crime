import java.util.Scanner;

/*
 * File: TestUSCrimes.java
 * Author: Isaac Olmedo
 * Date: 12-15-2020
 * Purpose: This program uses data from both
 *  CrimeData.java and USCrimes.java to create the Crime Statistics Program.
 */
public class TestUSCrimes {

    private static long elapsedTime;

    public static void main(String[] args) {
        // Set Elapsed Time
        long startTime = System.currentTimeMillis();
        long endTime;
        // read input
        Scanner input = new Scanner(System.in);
        // pass to class for results
        Crime crime = new Crime();
        // pass and print Welcome
        printWelcome();
        // user stores input here
        char specialInput;
        do {
            // Print OPtions after every input
            printMenuOptions();
            // user input stored for results
            specialInput = input.next().charAt(0);
            // input stored
            int finalResult;
            // options for user inputs
            switch (specialInput) {
                // Case 1 gets population growth percentage
                case '1':
                    double[] percentage = crime.getPopulationGrowth();
                    for (int i = 0; i < percentage.length; i++) {
                        int from = crime.getYears() + i;
                        int to = from + 1;
                        System.out
                                .printf("The Population growth percentage from year " + from + " to year " + to + " is"
                                        + ": %.4f", percentage[i]);
                        System.out.println("%");
                    } // End FOR STATE.
                    break;
                // case 2 gets highest Murder year
                case '2':
                    finalResult = crime.getYearWithHighestMurder();
                    System.out.println("The Murder rate was highest in year " + finalResult);
                    break;
                // case 3 gets lowest Murder year
                case '3':
                    finalResult = crime.getYearWithLowestMurder();
                    System.out.println("The Murder rate was lowest in year " + finalResult);
                    break;
                // case 4 gets highest Robbery year
                case '4':
                    finalResult = crime.getYearWithHighestRobbery();
                    System.out.println("The Robbery rate was highest in year " + finalResult);
                    break;
                // case 5 gets lowest Robbery year
                case '5':
                    finalResult = crime.getYearWithLowestRobbery();
                    System.out.println("The Robbery rate was lowest in year " + finalResult);
                    break;
                // Special character 'Q' Quits the program
                case 'Q':
                    break;
            }// End Input Switch
             // Start Quit Menu
        } while (specialInput != 'Q');
        input.close();
        endTime = System.currentTimeMillis();
        elapsedTime = (endTime - startTime) / 1000;
        printQuit();
    }// End elapsed time and scanner
     // What the user see's in the Menu:

    private static void printWelcome() {
        System.out.println("********** Welcome to the US Crime Statistical Application **********\n");
    }// End Welcome

    private static void printMenuOptions() {
        System.out.println("Enter the number of the question you want answered. Enter 'Q' to quit the program:\n");
        System.out.println(
                "1. What were the percentages in population growth for each consecutive year from 1994 to 2013?" +
                        "\n2. What year was the Murder rate the highest?" +
                        "\n3. What year was the Murder rate the lowest?" +
                        "\n4. What year was the Robbery rate the highest?" +
                        "\n5. What year was the Robbery rate the lowest?" +
                        "\nQ. Quit the program");
    }// End Menu

    private static void printQuit() {
        System.out.println("Thank you for trying the US Crimes Statistics Program.\n");
        System.out.println("Merry Christmas & Happy New Year! :) \n");
        System.out.println("Elapsed time in seconds was: " + elapsedTime);
    }// End Quit
}// End TestUSCrimes Class
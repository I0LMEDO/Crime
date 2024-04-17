import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

/*
 * File: Crime.java
 * Author: Isaac Olmedo
 * Date: 12-15-2020
 * Purpose: This program reads, organizes, and sorts the Crime.csv file
 * in order to get information.
 */
//Class called CrimeData
public class Crime {
    private ArrayList<USCrimes> values;

    // String for CrimeData
    public Crime() {
        String pathName = "CrimesFile.csv";
        values = new ArrayList<USCrimes>();
        // this will read the csv file
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathName));
            readLineData(br);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }// End CrimeData String.
     // Read line in files

    private void readLineData(BufferedReader in) throws IOException {
        String storeLine;
        in.readLine();
        while ((storeLine = in.readLine()) != null) {
            USCrimes usCrimes = crimeOrganize(storeLine);
            values.add(usCrimes);
        }
    }// End readLineData
     // Sort data into String Array

    private USCrimes crimeOrganize(String line) {

        String[] lineParts = line.split(",");

        int year = Integer.parseInt(lineParts[0]);
        int population = Integer.parseInt(lineParts[1]);
        float murderRate = Float.parseFloat(lineParts[2]);
        float robberyRate = Float.parseFloat(lineParts[3]);

        return new USCrimes(year, population, murderRate, robberyRate);
    }// End crimeOrganize
     // Calculate Population Growth.

    public double[] getPopulationGrowth() {

        double populationGrowth[] = new double[values.size() - 1];
        for (int i = 0; i < values.size() - 2; i++) {
            int currentPopulation = values.get(i).getPopulation();
            int nextPopulation = values.get(i + 1).getPopulation();
            double growthPopulation = (double) (nextPopulation - currentPopulation) / currentPopulation;
            populationGrowth[i] = growthPopulation * 100;
        }
        return populationGrowth;
    }// End Population Growth
     // Calculate years for next methods

    public int getYears() {
        return values.get(0).getYear();
    }// End Years
     // Calculate highest murder year

    public int getYearWithHighestMurder() {

        int highestMurderYear = values.get(0).getYear();
        float highest = values.get(0).getMurderRate();

        for (USCrimes crime : values) {
            float currentMurderRate = crime.getMurderRate();
            if (currentMurderRate > highest) {
                highestMurderYear = crime.getYear();
                highest = currentMurderRate;
            }
        } // End for statement
        return highestMurderYear;
    }// End Highest Murder Year
     // Calculate lowest murder year

    public int getYearWithLowestMurder() {

        int lowestMurderYear = values.get(0).getYear();
        float lowest = values.get(0).getMurderRate();

        for (USCrimes crime : values) {
            float currentMurderRate = crime.getMurderRate();
            if (currentMurderRate < lowest) {
                lowestMurderYear = crime.getYear();
                lowest = currentMurderRate;
            }
        } // End for statement
        return lowestMurderYear;
    }// End Lowest Murder Year
     // Calculate Highest Robbery.

    public int getYearWithHighestRobbery() {

        int highestRobberyYear = values.get(0).getYear();
        float highest = values.get(0).getRobberyRate();

        for (USCrimes crime : values) {
            float currentRobbery = crime.getRobberyRate();
            if (currentRobbery > highest) {
                highestRobberyYear = crime.getYear();
                highest = currentRobbery;
            }
        } // End for Statement
        return highestRobberyYear;
    }// End Highest Robbery Year
     // Calculate Lowest Robbery Year

    public int getYearWithLowestRobbery() {

        int lowestRobberyYear = values.get(0).getYear();
        float lowest = values.get(0).getRobberyRate();

        for (USCrimes crime : values) {
            float currentRobbery = crime.getRobberyRate();
            if (currentRobbery < lowest) {
                lowestRobberyYear = crime.getYear();
                lowest = currentRobbery;
            }
        } // End for statement
        return lowestRobberyYear;
    }// End Lowest Robbery year
}// End Class
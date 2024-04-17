/*
 * File: USCrimes.java
 * Author: Isaac Olmedo
 * Date: 12-15-2020
 * Purpose: This program gets and sets variables for
 * the Crime Statistics Program.
 */
public class USCrimes {
    private int year;
    private int population;
    private float murderRate;
    private float robberyRate;

    // Variables String
    public USCrimes(int year, int population, float murderRate, float robberyRate) {
        this.year = year;
        this.population = population;
        this.murderRate = murderRate;
        this.robberyRate = robberyRate;
    }// End String
    // Year Getter

    public int getYear() {
        return year;
    }// End Year Getter
    // Year Setter

    public void setYear(int year) {
        this.year = year;
    }// End Year Setter
    // Population Getter

    public int getPopulation() {
        return population;
    }// End Population Getter
    // Population Setter

    public void setPopulation(int population) {
        this.population = population;
    }// End Population Setter
    // Murder Rate Getter

    public float getMurderRate() {
        return murderRate;
    }// End Murder Rate Getter
    // Murder Rate Setter

    public void setMurderRate(float murderRate) {
        this.murderRate = murderRate;
    }// End Murder Rate Setter
    // Robbery Rate Getter

    public float getRobberyRate() {
        return robberyRate;
    }// End Robbery Rate Getter
    // Robbery Rate Setter

    public void setRobberyRate(float robberyRate) {
        this.robberyRate = robberyRate;
    }// End Robbery Rate Setter
}// End Class
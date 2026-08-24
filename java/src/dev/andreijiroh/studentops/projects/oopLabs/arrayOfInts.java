package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 02 Laboratory Exercise 1 - Data Structures and Algorithms
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class arrayOfInts {
    public static void main (String[] args) {
        int[] randNumbers = new int[5];

        /**
         * Rather than setting some random numbers by hand we'll let it generate random numbers for us
         *
         * Assisted-by: Zed Agent Edit Prediction in Zed
         */
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < randNumbers.length; i++) {
            System.out.println(randNumbers[i]);
        }
    }
}

package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 02 Laboratory Exercise 1 - Data Structures and Algorithms
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class arrayOfStrings {
    public static void main (String[] args) {
        String[] relatives = new String[5];

        /**
         * This is kinda obvious, isn't it?
         */
         relatives[0] = "Audrey Jean"; // older sibling
         relatives[1] = "Amber Jhoven"; // younger sibling
         relatives[2] = "Editha"; // mom
         relatives[3] = "Alvin"; // dad
         relatives[4] = "Alexander"; // granddad

         for (int i = 0; i < relatives.length; i++) {
             System.out.println(relatives[i]);
         }
    }
}

package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - 04 Performance Task
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class variableNamingConventions {
    public static void(String[] args) {
        // Set A
        int age = 24; // age
        double height = 1.75 // in meters
        String legalName = "Juan Luna IV"; // full name
        char gender = 'M' // gender
        boolean isStudent = true; // confirming if the person is a student

        // Set B but fixed
        int subjects = 6; // number of subjects
        double weight = 70.5 // weight in kg
        String birth_place = "Ilocos Norte"; // birthplace
        char blood_type = 'O'; // blood type
        boolean has_pets = true; // confirming if the person has pets

        // Set C
        System.out.println("Name: "+legalName);
        System.out.println("Height: "+height);
        System.out.println("Gender: "+gender);
        System.out.println("Is Student: "+isStudent);
        System.out.println("Number of Subjects: "+subjects);
        System.out.println("Weight: "+weight+" kg");
        System.out.println("City: "+birth_place);
        System.out.println("Blood type: "+blood_type);
        System.out.println("Has pets?: "+has_pets);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - 01 Activity 1
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class ComProgActivity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Halili, Andrei Jiroh Eugenio";
        int age = 19;
        // not the full address for privacy reasons
        String address = "lias, Marilao, Bulacan";
        String birthdate = "2006-01-23"; // ISO 8601 date format is used here
        String school = "STI College Meycauayan";
        String program = "Bachelor of Science in Information Technology (BSIT)";
        String id = "0200459491";
        
        // formmatted a bit with string interpolation via String.format
        System.out.println(String.format("Student name: %s", name));
        System.out.println(String.format("Student age: %s", age));
        System.out.println(String.format("Student address: %s", address));
        System.out.println(String.format("Student birthdate: %s", birthdate));
        System.out.println(String.format("College/university: %s", school));
        System.out.println(String.format("Course program: %s", program));
        System.out.println(String.format("Student ID: %s", id));
    }
    
}

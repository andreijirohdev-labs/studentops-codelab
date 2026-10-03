package dev.andreijiroh.studentops.projects.oopLabs.handsOnActivity0601;
import java.util.Scanner;

/**
 * 06 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class CollegeList {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true) {
      String firstPrompt = promptTooling.handleIntro(input);
      switch (firstPrompt.toLowerCase()) {
        case "e":
          promptTooling.handleEmployee(input);
          break;
        case "f":
          promptTooling.handleFaculty(input);
          break;
        case "s":
          promptTooling.handleStudent(input);
          break;
        default:
          break;
      }
    }
  }
}

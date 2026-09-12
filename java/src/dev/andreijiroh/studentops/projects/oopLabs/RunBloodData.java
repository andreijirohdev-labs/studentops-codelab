package dev.andreijiroh.studentops.projects.oopLabs;
import java.util.Scanner;

/**
 * 05 Hands-on Activity 1 - Object-Oriented Programming
 * 
 * For the previous version used in 04 Hands-on Activity 1, see the same class file at
 * ../../archive directory in the source repository.
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/oopLabs/RunBloodData.java
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/archive/RunBloodData.java
 */
public class RunBloodData {
  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    String input1;
    String input2;

    System.out.print("Enter blood type of patient: ");
    input1 = prompt.nextLine();

    System.out.print("Enter the Rhessus factor (+ or -): ");
    input2 = prompt.nextLine();

    if (!input1.isEmpty() && !input2.isEmpty()) {
      BloodData bd = new BloodData();
      bd.setBloodType(input1);
      bd.setRhFactor(input2);
      bd.display();
    } else {
      BloodData bd = new BloodData();
      bd.display();
    }

    prompt.close();
  }
}
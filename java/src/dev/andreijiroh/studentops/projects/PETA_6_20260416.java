package dev.andreijiroh.studentops.projects;
import java.util.Scanner;
import java.util.regex.*;

/**
 * 06 Performance Task 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class PETA_6_20260416 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    String passPattern = "^[a-zA-Z0-9]{8,}$";

    boolean isPasswordValid;

    String email;
    System.out.print("Enter your email: ");
    email = keyboard.nextLine();
    boolean isEnailValid = email.matches(pattern);
    
    if (isEnailValid == false) {
      System.out.println("Invalid email or password.");
      System.exit(1);
    }

    System.out.print("Enter password: ");
    String password = keyboard.nextLine();
    isPasswordValid = password.matches(passPattern);

    if (isPasswordValid) {
      System.out.println("Login successful!");
    } else {
      System.out.println("Invalid email or password.");
    }

    keyboard.close();
  }
}
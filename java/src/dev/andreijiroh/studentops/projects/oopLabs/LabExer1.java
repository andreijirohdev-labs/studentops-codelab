package dev.andreijiroh.studentops.projects.oopLabs;
import java.util.Scanner;

/**
 * 01 Laboratory Exercise 1 - Object-Oriented Programming
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class LabExer1 {
  /**
   * Adds 5 to both the first and second numbers.
   * @param val1 The first `double` variable
   * @param val2 The second `double` variable
   */
  public static void plusFive(double val1, double val2) {
    double result1 = val1 + 5;
    double result2 = val2 + 5;

    System.out.println(result1+" and "+result2);
  }

  /**
   * Multiply that by two
   * @param val1 The first `double` variable
   * @param val2 The second `double` variable
   */
  public static void timesTwo(double val1, double val2) {
    double result1 = val1 * 2;
    double result2 = val2 * 2;

    System.out.println(result1+" and "+result2);
  }

  /**
   * Get a squared version of that number.
   * @param val1 The first `double` variable
   * @param val2 The second `double` variable
   */
  public static void showSquared(double val1, double val2) {
    double result1 = val1 * val1;
    double result2 = val2 * val2;
    System.out.println(result1+" and "+result2);
  }

  /**
   * Multiply that by two
   * @param val1 The first `double` variable
   * @param val2 The second `double` variable
   */
  public static void computePrecent(double val1, double val2) {
    double percentage = (val1 / val2) * 100;
    System.out.println(val1+" is "+percentage+" percent of "+ val2);
  }

  /**
   * The main function of the program itself.
   * @param args Unused here
   */
  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    double firstNumber;
    double secondNumber;

    System.out.println("Enter two numbers.");
    System.out.print("First number: ");
    firstNumber = prompt.nextDouble();

    System.out.print("Enter the second number: ");
    secondNumber = prompt.nextDouble();
    prompt.nextLine(); // consume the leftover newline to avoid input issues

    prompt.close();

    plusFive(firstNumber, secondNumber);
    timesTwo(firstNumber, secondNumber);
    showSquared(firstNumber, secondNumber);
    computePrecent(firstNumber, secondNumber);
  }
}

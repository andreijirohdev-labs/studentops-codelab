package dev.andreijiroh.studentops.projects;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 04 Laboratory Exercise
 * v2 - tweaked to use a while loop to re-prompt on InputMismatchException
 * 
 * AI Usage Disclosure:
 * - Portions of code are generated with Gemini 3 Pro / 2.5 Flash Lite models via the
 *   Google Gemini CLI in Firebase Studio (formerly Project IDX). See the chat export
 *   archive at archive/genai-toolkit/gemini-chat-export-202603120858.md in the 
 *   project root directory.
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class DivideDemo_v2 {
  public static void main(String[] args) {
    while (true) {
      Scanner keyboard = new Scanner(System.in);
      try {
        int a = 10;
        System.out.print("Enter a integer: ");
        int b = keyboard.nextInt();
        int result = a / b;
        System.out.println("Result: " + result);
        break;
      } catch (ArithmeticException e) {
        System.err.println("Can't divide by zero or something gone wrong while trying to divide");
        break;
      } catch (InputMismatchException e) {
        System.err.println("That parameter must be a integer");
        keyboard.nextLine();
      } catch (Exception e) {
        System.err.println("Something gone wrong while running this program: "+ e);
        break;
      }
      keyboard.close();
    }
  }
}

package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 2 - 04 Laboratory Exercise
 * v1 - as seen on the whiteboard
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class DivideDemo {
  public static void main(String[] args) {
    try {
      int a = 10;
      int b = Integer.parseInt(args[0]);
      int result = a / b;
      System.out.println("Result: " + result);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Provide one integer to continue.");
    } catch (ArithmeticException e) {
      System.err.print("Can't divide by zero or something gone wrong while trying to divide");
    } catch (NumberFormatException e) {
      System.err.println("That parameter must be a integer");
    } catch (Exception e) {
      System.err.println("Something gone wrong while running this program: "+ e);
    }
  }
}

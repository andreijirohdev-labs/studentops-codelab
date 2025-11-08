package dev.andreijiroh.studentops.projects;
import java.util.Scanner;

/**
 * Computer Programming 1 - 06 Performance Task 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class calucatorPrompts {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int firstNumber;
    int secondNumber;
    String mathOperation;

    System.out.print("Enter the first number: ");
    firstNumber = scanner.nextInt();

    System.out.print("Enter the second number: ");
    secondNumber = scanner.nextInt();
    scanner.nextLine(); // consume the leftover newline to avoid input issues

    while (true) {
      System.out.print("Select the math operation to use between these two numbers: [+ | - | / | * ] ");
      mathOperation = scanner.nextLine().trim();

      if (mathOperation.isEmpty() || mathOperation.isBlank()) {
        System.out.println("error: Math operation shouldn't be blank!");
      } else {
        break;
      }
    }

    int mathOperationResult;

    switch (mathOperation) {
      case "+":
        mathOperationResult = firstNumber + secondNumber;
        System.out.println(String.format("Math: %s + %s = %s", firstNumber, secondNumber, mathOperationResult));
        break;
      case "-":
        mathOperationResult = firstNumber - secondNumber;
        System.out.println(String.format("Math: %s - %s = %s", firstNumber, secondNumber, mathOperationResult));
        break;
      case "*":
        mathOperationResult = firstNumber * secondNumber;
        System.out.println(String.format("Math: %s * %s = %s", firstNumber, secondNumber, mathOperationResult));
        break;
      case "/":
        // we don't want to cause problems due to division by zero here
        if (secondNumber == 0) {
          System.out.println("error: Division by zero is not allowed!");
          System.exit(1);
        }
        double divisionResult = (double) firstNumber / secondNumber;
        System.out.println(String.format("Math: %s / %s = %s", firstNumber, secondNumber, divisionResult));
        break;
      default:
        System.out.println("Unsupported math operation (signs only)");
        System.exit(1);
    }

    scanner.close(); // always close the scanner to avoid memory leaks
  }
}
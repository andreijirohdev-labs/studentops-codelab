package dev.andreijiroh.studentops.projects.oopLabs;
import java.util.Scanner;

/**
 * 03 Task Performance - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/oopLabs/RunAmountDue.java
 */
public class RunAmountDue {
  /**
   * Show the welcome message on run.
   */
  public static void showWelcomeMessage() {
    String welcomePrompt = """
        Press any of the following then enter values separated by spaces:
        1 - Price only
        2 - Price and quantity
        3 - Price, quantity, and discount amount""";
    System.out.println(welcomePrompt);
  }

  /**
   * 
   * @param computedAmountDue The resulting double from the computeAmountDue function.
   */
  public static void showAmountDue(double computedAmountDue) {
     System.out.println("Amount due is "+computedAmountDue);
  }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    showWelcomeMessage();

    switch (userInput.nextInt()) {
      case 1:
        double totalAmount = AmountDue.computeAmountDue(userInput.nextDouble());
        showAmountDue(totalAmount);
        break;
      case 2:
        double totalAmountWithQuantity = AmountDue.computeAmountDue(userInput.nextDouble(), userInput.nextDouble());
        showAmountDue(totalAmountWithQuantity);
      case 3:
        double totalAmountWithDiscount = AmountDue.computeAmountDue(userInput.nextDouble(), userInput.nextDouble(), userInput.nextDouble());
        showAmountDue(totalAmountWithDiscount);
    }

    userInput.close();
  }
}

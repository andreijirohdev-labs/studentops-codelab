package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * The library implementation of computing amount due itself
 * for 03 Task Performance in Object-Oriented Programming.
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class AmountDue {
  /**
   * The 12% PH VAT as decimal form
   */
  private static double tax = 0.12;

  /**
   * Computes the amount due by adding the price passed to the function
   * then adding the VAT amount after getting the VAT percentage of the
   * amount itself.
   * @param price The price in Philippine Peso.
   * @return The computed amount due with VAT added as separate line.
   */
  public static double computeAmountDue(double price) {
    double vatAmount = price * tax;
    return price + vatAmount;
  }

  /**
   * Computes the amount due by adding the price passed to the function
   * then adding the VAT amount after getting the VAT percentage of the
   * amount itself.
   * @param price The price in Philippine Peso.
   * @param quantity The amount of quantity to multiply with the price itself.
   * @return The computed amount due with VAT added as separate line after multiplying with the ite.
   */
  public static double computeAmountDue(double price, double quantity) {
    double amountBeforeTax = price * quantity;
    double vatAmount = amountBeforeTax * tax;
    return amountBeforeTax + vatAmount;
  }

  /**
   * Computes the amount due by adding the price passed to the function
   * then adding the VAT amount after getting the VAT percentage of the
   * amount itself.
   * @param price The price in Philippine Peso.
   * @param quantity The amount of quantity to multiply with the price itself.
   * @param discount The discount amount to subtract against the original price.
   * @return The computed amount due with VAT added as separate line, minus the discount provided.
   */
  public static double computeAmountDue(double price, double quantity, double discount) {
    double amountBeforeTax = price * quantity;
    double vatAmount = (amountBeforeTax - discount) * tax;
    return (amountBeforeTax - discount) + vatAmount;
  }
}

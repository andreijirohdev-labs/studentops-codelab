package dev.andreijiroh.studentops.projects.oopLabs;

public class SavingAccount {
  private double balance;
  public static double interestRate = 0;

  public static void setInterestRate(double newRate) {
    interestRate = newRate;
  };

  public static void deposit(double amount) {
    balance = balance + amount;
  };

  public static void withdraw(double amount) {
    if (balance >= amount) {
      
    }
  }
}

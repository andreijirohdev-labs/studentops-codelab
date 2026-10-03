package dev.andreijiroh.studentops.projects.oopLabs.handsOnActivity0601;

/**
 * 06 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class Employee extends Person {
  private String department;
  private double salary;

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public double getSalary() {
    return salary;
  }
}

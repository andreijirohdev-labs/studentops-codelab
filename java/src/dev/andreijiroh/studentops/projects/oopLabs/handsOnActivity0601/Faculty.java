package dev.andreijiroh.studentops.projects.oopLabs.handsOnActivity0601;

/**
 * 06 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class Faculty extends Employee {
  private boolean status;

  public void setStatus(boolean status) {
    this.status = status;
  }
  public boolean isRegular() {
    return status;
  }
}

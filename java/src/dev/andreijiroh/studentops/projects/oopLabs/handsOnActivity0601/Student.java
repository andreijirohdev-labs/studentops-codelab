package dev.andreijiroh.studentops.projects.oopLabs.handsOnActivity0601;
import java.util.Scanner;

/**
 * 06 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class Student extends Person {
  private String program;
  private int yearLevel;

  public void setProgram(String program) {
    this.program = program;
  }

  public void setYearLevel(int yearLevel) {
    this.yearLevel = yearLevel;
  }

  public String getProgram() {
    return program;
  }

  public int getYearLevel() {
    return yearLevel;
  }
}

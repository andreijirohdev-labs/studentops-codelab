package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 04 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/oopLabs/BloodData.java
 */
class BloodData {
  private String bloodType;
  private String rhFactor;

  public BloodData() {
    bloodType = "O";
    rhFactor = "+";
  }

  public BloodData(String bh, String rh) {
    this.bloodType = bh;
    this.rhFactor = rh;
  }

  public void display() {
    System.out.println(bloodType+rhFactor+" is added to the blood bank.");
  }
}
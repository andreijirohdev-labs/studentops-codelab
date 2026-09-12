package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 05 Hands-on Activity 1 - Object-Oriented Programming
 * 
 * For the previous version used in 04 Hands-on Activity 1, see the same class file at
 * ../../archive directory in the source repository.
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/oopLabs/BloodData.java
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/archive/BloodData.java
 */
class BloodData {
  private String bloodType;
  private String rhFactor;

  public BloodData() {
    bloodType = "O";
    rhFactor = "+";
  }

  public void setBloodType(String bt) {
    this.bloodType = bt;
  }

  public String getBloodType() {
    return bloodType;
  }

  public void setRhFactor(String rh) {
    this.rhFactor = rh;
  }

  public String getRhFactor() {
    return rhFactor;
  }

  public void display() {
    System.out.println(getBloodType()+getRhFactor()+" is added to the blood bank.");
  }
}
package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 06 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class Person {
  private String name;
  private String contactNum;

  public void setName(String name) {
    this.name = name;
  }

  public void setContactNum(String contactNum) {
    this.contactNum = contactNum;
  }

  public String getName() {
    return name;
  }

  public String getContactNum() {
    return contactNum;
  }
}

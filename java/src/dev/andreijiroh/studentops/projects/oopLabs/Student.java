package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class Student {
  private String name;
  private long studentId;
  private String course;
  private double gpa;

  public Student(String n, long id, String c, double gwa) {
    name = n;
    studentId = id;
    course = c;
    gpa = gwa;
  };

  protected void displayStudentDetails() {
    System.out.println("===== STUDENT DETAILS =====");
    System.out.println("Name: "+ name);
    System.out.println("Student ID: "+studentId);
    System.out.println("Course: "+course);
    System.out.println("GPA/GWA: "+gpa);
    System.out.println();
  }
}
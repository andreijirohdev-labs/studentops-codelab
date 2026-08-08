package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 
 * StudentDirectory - shows two students from the directory
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class StudentDirectory {
  public static void main(String[] args) {
    Student placeholder = new Student("Example Student", 200123456, "BSBA", 3);
    placeholder.displayStudentDetails();

    Student self = new Student("Andrei Jiroh Halili", 200459491, "BSIT", 1.97);
    self.displayStudentDetails();
  }
}

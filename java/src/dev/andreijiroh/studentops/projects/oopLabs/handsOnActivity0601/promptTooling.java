package dev.andreijiroh.studentops.projects.oopLabs.handsOnActivity0601;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern

import dev.andreijiroh.studentops.projects.oopLabs.Employee;
import dev.andreijiroh.studentops.projects.oopLabs.Faculty;

/**
 * 06 Hands-on Activity 1 - Object-Oriented Programming
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class promptTooling {
  public static String handleIntro(Scanner input) {
    System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
    return input.nextLine();
  }

  public static void handleEmployee(Scanner input) {
    Employee staffData = new Employee();
    System.out.println("Type employee's name, contact number, salary, and department. Press Enter after every input.");
    String name = input.nextLine();
    String contactNum = input.nextLine();
    double salary = input.nextDouble();
    input.nextLine();
    String department = input.nextLine();

    staffData.setName(name);
    staffData.setContactNum(contactNum);
    staffData.setSalary(salary);
    staffData.setDepartment(department);

    System.out.println(staffData);
  }

  public static void handleFaculty(Scanner input) {
    final String regexForTrue = "true|yes|y|t";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

    Faculty facultyData = new Faculty();
    System.out.println("Type faculty's name, contact number, salary, and department and whethever they are regular or not. Press Enter after every input.");
    String name = input.nextLine();
    String contactNum = input.nextLine();
    double salary = input.nextDouble();
    String department = input.nextLine();
    System.out.println("Is the faculty tenured?");
    String isRegular = input.nextLine();

    final Matcher isRegularMatcher = pattern.matcher(isRegular);
    boolean isTenured = isRegularMatcher.find();

    facultyData.setName(name);
    facultyData.setContactNum(contactNum);
    facultyData.setSalary(salary);
    facultyData.setDepartment(department);
    facultyData.setStatus(isTenured);

    System.out.println(facultyData);
  }

  public static void handleStudent(Scanner input) {
    Student studentData = new Student();
    System.out.println("Type student's name, contact number, program, and year level. Press Enter after every input.");
    String name = input.nextLine();
    String contactNum = input.nextLine();
    String program = input.nextLine();
    int yearLevel = input.nextInt();

    studentData.setName(name);
    studentData.setContactNum(contactNum);
    studentData.setProgram(program);
    studentData.setYearLevel(yearLevel);

    System.out.println(studentData);
  }
}

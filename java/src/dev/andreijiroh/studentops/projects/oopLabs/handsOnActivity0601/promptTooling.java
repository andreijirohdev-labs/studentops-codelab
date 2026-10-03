package dev.andreijiroh.studentops.projects.oopLabs.handsOnActivity0601;
import java.util.Scanner;

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

    System.out.println("------------------------------");
    System.out.println("Name: "+staffData.getName());
    System.out.println("Contact Number: "+staffData.getContactNum());
    System.out.println("Salary: "+staffData.getSalary());
    System.out.println("Department: "+staffData.getDepartment());
  }

  public static void handleFaculty(Scanner input) {
    Faculty facultyData = new Faculty();
    System.out.println("Type faculty's name, contact number, salary, and department and whethever they are regular or not. Press Enter after every input.");
    String name = input.nextLine();
    String contactNum = input.nextLine();
    double salary = input.nextDouble();
    String department = input.nextLine();
    System.out.print("Is the faculty tenured? ");
    String isRegular = input.nextLine();

    switch (isRegular.toLowerCase()) {
      case "yes":
        facultyData.setStatus(true);
        break;
      case "no":
        facultyData.setStatus(false);
        break;
      default:
        facultyData.setStatus(false);
        break;
    }

    facultyData.setName(name);
    facultyData.setContactNum(contactNum);
    facultyData.setSalary(salary);
    facultyData.setDepartment(department);

    System.out.println("------------------------------");
    System.out.println("Name: "+facultyData.getName());
    System.out.println("Contact Number: "+facultyData.getContactNum());
    System.out.println("Salary: "+facultyData.getSalary());
    System.out.println("Department: "+facultyData.getDepartment());
    if (facultyData.isRegular() == true) {
      System.out.println("Is tenured?: Yes");
    } else if (facultyData.isRegular() == false) {
      System.out.println("Is tenured?: false");
    }
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

    System.out.println("------------------------------");
    System.out.println("Name: "+studentData.getName());
    System.out.println("Contact Number: "+studentData.getContactNum());
    System.out.println("Program: "+studentData.getProgram());
    System.out.println("Year Level: "+studentData.getYearLevel());
  }
}

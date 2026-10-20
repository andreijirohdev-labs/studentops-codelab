package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 05 Laboratory Exercise 1 - Data Structures and Algorithms
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/StudentDirectory.java
 */
public class StudentDirectory {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, String> studentList = new HashMap<>();

    System.out.print("Enter number of students: ");
    Integer n = input.nextInt();
    input.nextLine();

    for (int i = 0; i < n; i++) {
      System.out.print("Enter student number: ");
      String studNum = input.nextLine();

      System.out.print("Enter student name: ");
      String studName = input.nextLine();

      studentList.put(studNum, studName);
    }

    System.out.println("Student directory: " + studentList);

    do {
      System.out.println("Choose an operation:\n1 - Search, 2 - Remove 3 - Add/Update, 4 - Exit");
      System.out.print("Enter your choice: ");
      Integer choice = input.nextInt();
      input.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter student number to search: ");
          String searchNum = input.nextLine();

          if (studentList.containsKey(searchNum)) {
            System.out.println("Student name: "+ studentList.get(searchNum));
          } else {
            System.out.println("No record found with that student ID");
          }
          break;
        case 2:
          System.out.print("Enter student number to search: ");
          String removeNum = input.nextLine();

          if (studentList.containsKey(removeNum)) {
            System.out.println("Removed student "+ studentList.get(removeNum));
            studentList.remove(removeNum);
            System.out.println("Updated student directory: " + studentList);
          } else {
            System.out.println("No record found with that student ID");
          }
          break;
        case 3:
          System.out.print("Enter student number to add or update: ");
          String newNum = input.nextLine();
          System.out.print("Student name: ");
          String newName = input.nextLine();

          if (studentList.containsKey(newNum)) {
            studentList.replace(newNum, newName);
            System.out.println("Existing record found. Updated existing entry");
          } else {
            studentList.putIfAbsent(newNum, newName);
            System.out.println("No existing record found. Added new entry");
          }
          System.out.println("Updated student directory: " + studentList);
          break;
        case 4:
          input.close();
          System.exit(0);
        default:
          System.out.println("Unsupported choice selection");
      }
    } while (true);
  }
}

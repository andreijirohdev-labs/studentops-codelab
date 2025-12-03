package dev.andreijiroh.studentops.projects;
import java.util.Scanner;
import java.util.Calendar;

/**
 * Computer Programming 1 - 05 Laboratory Exercise 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class inputAndOutput {
    public static void main(String[] args) {
        /**
         * Instead of initializing Scanner seperately, we declare and
         * initialize it in the same line.
         */
        Scanner scanner = new Scanner(System.in);
        Calendar today = Calendar.getInstance();

        String name;
        String section;
        String studentType;
        int id;
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int day = today.get(Calendar.DAY_OF_MONTH);
        String subject;
        String activitySummary;
        String whatWentWell;
        String whatWentWrong;
        String reflection;

        // check if name is empty after the prompt
        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
            } else {
                break;
            }
        }

        System.out.print("Enter your section: ");
        section = scanner.nextLine().trim();

        System.out.print("Enter your student ID number: ");
        id = scanner.nextInt();

        while (true) {
            System.out.print("Are you a college student or a senior high school student? (senior high/college): ");
            studentType = scanner.nextLine().trim().toLowerCase();

            if (studentType.equals("senior high") || studentType.equals("college")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'senior high' or 'college'.");
            }
        }

        // ask if it is for today's date or a different date
        while (true) {
            String prompt;
            System.out.print("Do you want to use the current date (" + year + "-" + month + "-" + day + ") for this entry? (yes/no): ");
            prompt = scanner.nextLine().trim().toLowerCase();
            if (prompt.equals("yes")) {
                System.out.println("Enter year: " + year);
                System.out.println("Enter month: " + month);
                System.out.println("Enter day: " + day);
                break; // stop here and use current date
            } else if (prompt.equals("no")) {
                System.out.print("Enter year (e.g., 2025): ");
                year = scanner.nextInt();
                System.out.print("Enter month (1-12): ");
                month = scanner.nextInt();
                System.out.print("Enter day (1-31): ");
                day = scanner.nextInt();
                break; // stop here and use user-provided date
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        System.out.print("Enter the subject you studied today: ");
        subject = scanner.nextLine().trim();

        System.out.print("Provide a brief summary of your activities today: ");
        activitySummary = scanner.nextLine().trim();

        System.out.print("What went well today? ");
        whatWentWell = scanner.nextLine().trim();

        System.out.print("What went wrong today and what to improve? ");
        whatWentWrong = scanner.nextLine().trim();

        System.out.print("Any reflections or thoughts about today's learning? ");
        reflection = scanner.nextLine().trim();

        System.out.println(); // Print a blank line for better readability
        System.out.println("=============== SCRAPBOOK ENTRY ===============");
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Student Type: " + studentType);
        System.out.println("Student ID: " + id);
        System.out.println("Date: " + year + "-" + month + "-" + day);
        System.out.println("Subject Studied: " + subject);
        System.out.println("Activities Summary: " + activitySummary);
        System.out.println("What Went Well: " + whatWentWell);
        System.out.println("What Went Wrong: " + whatWentWrong);
        System.out.println("Reflections: " + reflection);
        System.out.println("================================================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
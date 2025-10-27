package dev.andreijiroh.studentops.projects;
import java.util.Scanner;

/**
 * Computer Programming 1 - 06 Laboratory Exercise 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class gradesValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String subject;
        int finalGrade;

        System.out.print("Enter your course subject name or code: ");
        subject = scanner.nextLine().trim();

        System.out.print("Enter the final grade (computed after getting 40% finals, 20% prelims to pre-finals): ");
        finalGrade = scanner.nextInt();

        if (finalGrade > 60) {
            if (finalGrade >= 90) {
                System.out.println(String.format("%s: PASSED WITH HONORS", subject));
            } else {
                System.out.println(String.format("%s: PASSED", subject));
            }
        } else {
            System.out.println(String.format("%s: FAILED", subject));
        }
    }
}
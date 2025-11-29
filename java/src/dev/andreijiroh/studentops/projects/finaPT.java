package dev.andreijiroh.studentops.projects;
// import the entire base modules
import module java.base;

/**
 * Computer Programming 1 - 07 Performance Task 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class finaPT {
  public static void main(String[] args) {
    // Output
    System.out.println("Well hello there!");

    // Input + loops
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("What's cooking for today? ");
      String dailyLog = scanner.nextLine().trim();

      if (dailyLog.isEmpty()) System.out.print("You forgot to log something");

      break;
    }
    

    // Array

    // Conditionals (if-then-else, switch)

    // loops

    scanner.close();
  }
}

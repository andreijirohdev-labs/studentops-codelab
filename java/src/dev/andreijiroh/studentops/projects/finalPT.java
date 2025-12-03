package dev.andreijiroh.studentops.projects;
import module java.base; // `import module` as preview in Java 23, standard in Java 25
import java.util.Scanner;

/**
 * Computer Programming 1 - 07 Performance Task 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class finalPT {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Output
    System.out.println("Well hello there!");

    // Input + loops
    String dailyLog;
    while (true) {
      System.out.print("What's cooking for today? (summarize what you did in a few sentences) ");
      dailyLog = scanner.nextLine().trim();
      if (dailyLog.isEmpty()) {
        System.out.println("You forgot to log something");
      } else {
        break;
      }
    }

    // Array + conditionals (switches)
    String[] categories = {"School", "Work", "Personal", "Others"};
    String category = null;
    String cat_prompt = """
    Available categories:

    [1] School
    [2] Work
    [3] Personal
    [4] Others

    Please select the category in question for this entry: """;
    while (true) {
      System.out.print(cat_prompt);
      int category_number = scanner.nextInt();
      switch (category_number) {
        case 1:
          category = categories[0];
          break;
        case 2:
          category = categories[1];
        case 3:
          category = categories[2];
        case 4:
          category = categories[3];
        default:
          System.out.println("Please select the number");
      };
      break;
    };
    scanner.close();

    Calendar today = Calendar.getInstance();
    int year = today.get(Calendar.YEAR);
    int month = today.get(Calendar.MONTH) + 1;
    int day = today.get(Calendar.DAY_OF_MONTH);
    System.out.println("Date: " + year + "-" + month + "-" + day);
    System.out.println("Journal entry: " + dailyLog);
    System.out.println("Category: " + category);
  }
}

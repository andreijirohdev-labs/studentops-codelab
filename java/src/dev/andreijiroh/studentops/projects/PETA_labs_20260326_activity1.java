package dev.andreijiroh.studentops.projects;
import java.util.Scanner;

/**
 * PETA activity 1 code for lab exercise on 2026-03-26
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class PETA_labs_20260326_activity1 {
  enum months {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
  };

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int monthNumber;

    System.out.print("Enter month number (1-12): ");
    monthNumber = keyboard.nextInt();
    keyboard.nextLine(); // let's consume the leftover newline to avoid input related issues

    int parsedMonthNumber = monthNumber - 1;
    months month = months.values()[parsedMonthNumber];
    System.out.println("Month: "+month);

    keyboard.close();

    switch (month) {
      case January:
        System.out.println("Happy new year / birth month!");
        break;
      case February:
        System.out.println("Happy Valentines all February!");
        break;
      case March:
        System.out.println("Graduation time!");
        break;
      case April:
        System.out.println("TBD");
        break;
      case May:
        System.out.println("TBD");
        break;
      case June:
        System.out.println("TBD");
        break;
      case July:
        System.out.println("TBD");
        break;
      case August:
        System.out.println("TBD");
        break;
      case September:
        System.out.println("TBD");
        break;
      case October:
        System.out.println("TBD");
        break;
      case November:
        System.out.println("We'll be in [INSERT CEREMENTRY HERE] sending you thoughts and prayers. (context: TheJuiceMedia Honest Gov't Ads)");
        break;
      case December:
        System.out.println("Happy holidays!");
        break;
      default:
        // TNB\
        break;
    };
  }
}

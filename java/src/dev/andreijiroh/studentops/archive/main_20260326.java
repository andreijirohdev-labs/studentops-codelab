package dev.andreijiroh.studentops.archive;

/**
 * Sandbox code for lab exercise on 2026-03-26
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class main_20260326 {
  enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
    TEST_NOT_A_DAY // only exist to trigger the case part in switch-case
  };

  public static void main(String[] args) {
    Day today = Day.THURSDAY;
    Day d1 = Day.MONDAY;
    Day d2 = Day.TUESDAY;
    Day d3 = Day.WEDNESDAY;
    Day d4 = Day.THURSDAY;
    Day d5 = Day.FRIDAY;
    Day d6 = Day.SATURDAY;
    Day d7 = Day.SUNDAY;
    System.out.println("Today is "+today);


    switch (today) {
      case MONDAY:
        System.out.println(":new: Start of the week");
        break;
      case TUESDAY:
        System.out.println(":eyes: Second day of the week");
        break;
      case WEDNESDAY:
        System.out.println(":clock12: Mid-week day");
        break;
      case THURSDAY:
        System.out.println(":eyes: Almost weekend soon (a.k.a. last day of class for this week on your 1Y2 schedule)");
        break;
      case FRIDAY:
        System.out.println("💤 Enjoy your Mental health Friday / Free Day!");
        break;
      case SATURDAY:
        System.out.println(":confetti: Happy weekend!");
        break;
      case SUNDAY:
        System.out.println(":confetti: Happy weekend!");
        break;
      default: // Use Day.TEST_NOT_A_DAY as value on today variable to trigger this
        System.err.println(":warning: That was diabolical since it's not a day.");
        break;
    };

    for (Day d: Day.values()) {
      System.out.println(d);
    }

    System.out.println("toString: "+d1.toString());
    System.out.println("ordinal of "+d1+": "+d1.ordinal());
    System.out.println("toString: "+d2.toString());
    System.out.println("ordinal of "+d2+": "+d2.ordinal());
    System.out.println("toString: "+d3.toString());
    System.out.println("ordinal of "+d3+": "+d3.ordinal());
    System.out.println("toString: "+d4.toString());
    System.out.println("ordinal of "+d4+": "+d4.ordinal());
    System.out.println("toString: "+d5.toString());
    System.out.println("ordinal of "+d5+": "+d5.ordinal());
    System.out.println("toString: "+d6.toString());
    System.out.println("ordinal of "+d6+": "+d6.ordinal());
    System.out.println("toString: "+d7.toString());
    System.out.println("ordinal of "+d7+": "+d7.ordinal());

    System.out.println("compareTo(d2): "+d1.compareTo(d2));
    System.out.println("compareTo(MONDAY): "+d1.compareTo(Day.MONDAY));

    System.out.print("ALLDAYS: ");
    for (Day d:Day.values()) {
      System.out.print(d+" ");
    }

    String input = "FRIDAY";
    Day today_v2 = Day.valueOf(input);

    
    System.out.println(today_v2);
  }
}
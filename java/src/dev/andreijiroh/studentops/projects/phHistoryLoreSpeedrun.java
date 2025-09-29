package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - 03 Laboratory Exercise 1
 * Might be TOO tempting to pull a musician from my radar for obvious reasons and as stated in the instructions, but chose to pull Antonio Luna instead
 * from PH history for funsies and to celebrate TBA Studios' upcoming movie release of Quezon on October 15, 2025.
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @license MPL-2.0
 */
public class phHistoryLoreSpeedrun {
    static class antonioLuna {
        class birthdate {
            public static float year = 1866;
            public static int month = 10;
            public static int day = 29;
        }

        class death {
            public static boolean isAssassinated = true;
            public static float year = 1899;
            public static int month = 6;
            public static int day = 5;
        }

        public static String name = "Antonio Narciso Luna de San Pedro y Novicio Ancheta";
        public static byte gender = 'M';
        public static int age = 32;
    }

    public static void main(String[] args) {
        System.out.println("===== PH History Speedrun =====");
        System.out.println("Name: " + antonioLuna.name);
        System.out.println("Age: " + antonioLuna.age +
                " (born on " + antonioLuna.birthdate.year+"-"+antonioLuna.birthdate.month+"-"+
                antonioLuna.birthdate.day + ")");
        System.out.println("Gender: " + antonioLuna.gender);
        System.out.println("Died on: " + antonioLuna.death.year+"-"+antonioLuna.death.month+"-"+
                antonioLuna.death.day);
        System.out.println("Is assassinated: "+antonioLuna.death.isAssassinated);
        System.out.println("===============================");
    }
}

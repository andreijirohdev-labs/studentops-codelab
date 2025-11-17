package dev.andreijiroh.studentops.projects;
import static java.lang.String.format;

/**
 * Computer Programming 1 - 07 Laboratory Exercise 1
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class fullNameChars {
  public static void main(String[] args) {
    char firstLastName[] = {'A', 'n', 'd', 'r', 'e', 'i', ' ', 'J', 'i', 'r', 'o', 'h', ' ', 'H', 'a', 'l', 'i', 'l', 'i'};

    // [GITHUB COPILOT AHEAD] Simplifier approach without the manual indexing pain by doing `new String` here first...
    String fullName = new String(firstLastName);

    // [GITHUB COPILOT AHEAD] ...and use that var with the .substring() function.
    System.out.println(format("First name: %s", fullName.substring(0,12)));
    System.out.println(format("Last name: %s", fullName.substring(13)));
    System.out.println(format("Full name: %s", fullName));
  }
}
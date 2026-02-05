package dev.andreijiroh.studentops.projects;
import java.util.Scanner;
import dev.andreijiroh.studentops.projects.BarbershopService;

/**
 * Computer Programming 2 - 01 Laboratory Exercise
 * 
 * The main output for the lab itself.
 * 
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://elms.sti.edu/student_lesson/show/5530563?lesson_id=25675185&section_id=108711104
 */
public class CreateBarbershop {
  public static void main(String[] args) {
    BarbershopService firstService = new BarbershopService();
    BarbershopService secondService = new BarbershopService();
    Scanner keyboard = new Scanner(System.in);

    // Step 1: Ask for the first service details
    System.out.print("[First service] Please enter the service description: ");
    String serviceDesc1 = keyboard.nextLine().trim();
    System.out.print("[First service] Please enter the price for this service: ");
    double serivcePrice1 = keyboard.nextInt();
    firstService.setServiceDescription(serviceDesc1);
    firstService.setPrice(serivcePrice1);

    // FIX: Consume the leftover newline from servicePrice1 prompt to avoid issues rendering the result,
    // and to properly handle serviceDes2 prompt.
    keyboard.nextLine();

    // Step 2: Print service details for the first service
    System.out.println();
    System.out.println("========== SERVICE INFORMATION #1 ==========");
    System.out.println("Description: " + firstService.getServiceDescription());
    System.out.println("Price: PHP "+ firstService.getPrice());
    System.out.println();

    // Step 3: Ask for the second service details
    System.out.print("[Second service] Please enter the service description: ");
    String serviceDesc2 = keyboard.nextLine().trim();
    System.out.print("[Second service] Please enter the price for this service: ");
    double serivcePrice2 = keyboard.nextInt();
    secondService.setServiceDescription(serviceDesc2);
    secondService.setPrice(serivcePrice2);

    // FIX: Consume the leftover newline from servicePrice2 prompt to avoid issues rendering the result.
    keyboard.nextLine();

    // Step 4: Print service details for the second service
    System.out.println();
    System.out.println("========== SERVICE INFORMATION #2 ==========");
    System.out.println("Description: " + secondService.getServiceDescription());
    System.out.println("Price: PHP "+ secondService.getPrice());
    System.out.println();

    // Since we're done collecting data, close the scanner
    keyboard.close();
  }
}

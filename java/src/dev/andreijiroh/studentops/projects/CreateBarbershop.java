package dev.andreijiroh.studentops.projects;
import java.util.Scanner;
import dev.andreijiroh.studentops.projects.BarbershopService;

/**
 * Computer Programming 2 - 01 Laboratory Exercise
 * 
 * The main output for the lab itself.
 * 
 * @author Andrei Jiroh Eugenio Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class CreateBarbershop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CreateBarbershop firstService = new CreateBarbershop();
    CreateBarbershop secondService = new CreateBarbershop();

    System.out.print("Please enter the service description: ");
    String serviceDesc = scanner.nextLine().trim();
    System.out.print("Please enter the price for this service: ");
    double price = scanner.nextInt();

    scanner.close();
  }
}

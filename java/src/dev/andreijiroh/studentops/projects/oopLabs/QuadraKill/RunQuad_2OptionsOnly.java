package dev.andreijiroh.studentops.projects.oopLabs.QuadraKill;

import java.util.Scanner;

public class RunQuad_2OptionsOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square sq = new Square();
        Quadrilateral rec = new Rectangle();

        String prompt = "Press R for Rectangle or S for Square. ";
        
        do {
            System.out.print(prompt);
            String selectedOption = input.nextLine();
            
            if (selectedOption.isEmpty()) {
                System.out.print("Choose an option to continue");
            } else if (selectedOption.length() == 1) {
                try {
                    switch (selectedOption) {
                        case "R":
                            System.out.println("A rectangle has:");
                            rec.showDescription();
                            Thread.sleep(1000);
                            break;
                        case "S":
                            System.out.println("A square has:");
                            sq.showDescription();
                            Thread.sleep(1000);
                            break;
                        default:
                            System.out.println("Unsupported option");
                            break;
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else if (selectedOption.length() > 1) {
                System.out.println("One letter is only needed here");
            }
        } while (true);
    }
}

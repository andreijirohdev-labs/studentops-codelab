package dev.andreijiroh.studentops.projects.oopLabs.QuadraKill;

import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Square sq = new Square();
        Rectangle rec_q = new Rectangle();
        Quadrilateral rec = (Rectangle)rec_q;

        Quadrilateral para = new Parallelogram();
        Parallelogram bus = new Rhombus();
        Trapezoid NotTrapp = new Trapezoid();
        Quadrilateral trap = NotTrapp;

        String prompt = """
        Select from the following:
        R - Rectangle
        S - Square
        P - Parellelogram
        H - Rhombus
        T - Trapezoid""";
        
        do {
            System.out.println(prompt);
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
                        case "P":
                            System.out.println("A parallelogram:");
                            para.showDescription();
                            Thread.sleep(1000);
                            break;
                        case "H":
                            System.out.println("A rhombus:");
                            bus.showDescription();
                            Thread.sleep(1000);
                            break;
                        case "T":
                            System.out.println("A trapezoid:");
                            trap.showDescription();
                            Thread.sleep(1000);
                            break;
                        default:
                            System.out.println("Unsupported option");
                            Thread.sleep(1000);
                            break;
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    input.close();
                    System.exit(1);
                }
            } else if (selectedOption.length() > 1) {
                System.out.println("One letter is only needed here");
            }
        } while (true);
    }
}

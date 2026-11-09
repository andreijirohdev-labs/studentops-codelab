package dev.andreijiroh.studentops.projects.oopLabs.animalSounds;

/**
 * Implementation of Animal abstract class part 1 of 3
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class Bird extends Animal {
  public void makeSound() {
    System.out.println("Bird says 'tweet tweet'");
  }

  public void eat() {
    System.out.println("Bird eat seeds");
  }

  public void sleep() {
    System.out.println("Bird sleeps for 10-12 hours a day");
  }
}

package dev.andreijiroh.studentops.projects.oopLabs.animalSounds;

/**
 * Implementation of Animal abstract class part 3 of 3
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class Dog extends Animal {
  public void makeSound() {
    System.out.println("Dog says 'ruff ruff'");
  }

  public void eat() {
    System.out.println("Dog eats proteins, carbohydrates and fats");
  }

  public void sleep() {
    System.out.println("Dog sleeps for 12 to 20+ hours a day, depending on age.");
  }
}

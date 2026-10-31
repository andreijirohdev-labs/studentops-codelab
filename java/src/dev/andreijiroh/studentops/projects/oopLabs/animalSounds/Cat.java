package dev.andreijiroh.studentops.projects.oopLabs.animalSounds;

/**
 * Implementation of Animal abstract class part 2 of 3
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class Cat extends Animal {
  public void makeSound() {
    System.out.println("Cat says 'meow'");
  }

  public void eat() {
    System.out.println("Cat eats food usually with nutrients like taurine, arginine and arachidonic acid");
  }

  public void sleep() {
    System.out.println("Cat sleeps for 12 to 20 hours, depending on age");
  }
}

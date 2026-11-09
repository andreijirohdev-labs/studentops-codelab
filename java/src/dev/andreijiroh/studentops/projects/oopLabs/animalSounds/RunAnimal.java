package dev.andreijiroh.studentops.projects.oopLabs.animalSounds;
import java.util.Scanner;

public class RunAnimal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      String animalSelector;
      System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
      animalSelector = input.nextLine();

      if (animalSelector.equalsIgnoreCase("b")) {
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.makeSound();
      } else if (animalSelector.equalsIgnoreCase("c")) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.makeSound();
      } else if (animalSelector.equalsIgnoreCase("d")) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
      } else {
        System.out.println("That's not supported");
      }
    }
  }
}

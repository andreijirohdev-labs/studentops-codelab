package dev.andreijiroh.studentops.projects;

enum Color {
  RED,
  YELLOW,
  BLUE,
  GREEN,
  ORANGE,
  VIOLET
}

enum Model {
  SEDAN, SUV, CONVERTIBLE, HATCHBACK
}

class Car {
  private int year;
  private Color color;
  private Model model;

  Car(int yr, Model m, Color c) {
    year = yr;
    model = m;
    color = c;
  }

  public void display() {
    System.out.println("Year: "+year);
    System.out.println("Model: "+model);
    System.out.println("Color: "+color);
  }
}

public class CarDemo {
  public static void main(String[] args) {
    Car car1 = new Car(2014, Model.SUV, Color.RED);
    Car car2 = new Car(2025, Model.SEDAN, Color.GREEN);
    Car car3 = new Car(2012, Model.CONVERTIBLE, Color.YELLOW);
    car1.display();
    car2.display();
    car3.display();
  }
}

package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
class Car {
    private String color;
    private int speed;

    Car(String c, int s) {
        color = c;
        speed = s;
    };

    public void drive() {
        System.out.println("The "+color+" car is driving at "+speed+" mph!");
    };
};

public class theCar {
    public static void main(String[] args) {
        Car red = new Car("red", 67);
        Car blue = new Car("blue", 120);
        red.drive();
        blue.drive();
    };
};

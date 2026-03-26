package dev.andreijiroh.studentops.archive;

/**
 * Sandbox code for lab exercise on 2026-03-26
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

public class main2_20260326 {
  static class Outer {
    private String message = "Hello, I am outer";
    
    class Inner {
      void display() {
        System.out.print(message);
      }
    }
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.display();
  }
}

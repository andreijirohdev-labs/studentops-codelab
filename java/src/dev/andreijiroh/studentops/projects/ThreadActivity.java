package dev.andreijiroh.studentops.projects;

class OddThread extends Thread {
  public void run() {
    for (int i = 1; i < 11; i = i + 2) {
      System.out.println("Odd: "+i);

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    };
  }
}

class EvenThread extends Thread {
  public void run() {
    for (int i = 2; i < 12; i = i + 2) {
      System.out.println("Even: "+i);

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    };
  }
}
 
class SymbolThread extends Thread {
  public void run() {
    char[] symbols = {'@', '#', '$', '%', '&'};
    for (char s : symbols) {
      System.out.println("Symbol: " + s);
      try {
        Thread.sleep(400);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}


public class ThreadActivity {
  public static void main(String[] args) {
    EvenThread t1 = new EvenThread();
    OddThread t2 = new OddThread();
    SymbolThread t3 = new SymbolThread();

    t1.start();
    t2.start();
    t3.start();
  }
}

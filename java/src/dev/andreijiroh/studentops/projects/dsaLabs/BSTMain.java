package dev.andreijiroh.studentops.projects.dsaLabs;

/**
 * 03 Laboratory Exercise 2 - Data Strucutres and Algorithms
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/BST.java
 */
public class BSTMain {
  public static void main(String[] args) {
    BST t = new BST();
    int[] vals = {50,30,70,20,40,60,80};

    for (int v : vals) {
      t.insert(v);
    }
    t.inorderPrint();

    if (t.search(t.root, 40)) {
      System.out.println("Search 40: Found");
    } else {
      System.out.println("Search 40: Not Found");
    }

    if (t.search(t.root, 100)) {
      System.out.println("Search 100: Found");
    } else {
      System.out.println("Search 100: Not Found");
    }

    t.deleteKey(20);
    System.out.print("After deleting 20: ");
    t.inorderPrint();

    t.deleteKey(30);
    System.out.print("After deleting 30: ");
    t.inorderPrint();

    t.deleteKey(50);
    System.out.print("After deleting 50: ");
    t.inorderPrint();
  }
}

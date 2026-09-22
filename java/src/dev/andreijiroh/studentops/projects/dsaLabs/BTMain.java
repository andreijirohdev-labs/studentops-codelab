package dev.andreijiroh.studentops.projects.dsaLabs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/BTMain.java
 */
public class BTMain {
  public static void main(String[] args) {
    /**
     * Initialize the root node first
     */
    BinaryTree t = new BinaryTree();
    t.root = new Node(10);
    t.root.left = new Node(5);
    t.root.left.left = new Node(2);
    t.root.left.right = new Node(7);
    t.root.right = new Node(15);
    t.root.right.left = new Node(12);

    /**
     * Then the empty lists
     */
    List<Integer> in = new ArrayList<>();
    List<Integer> pre = new ArrayList<>();
    List<Integer> post = new ArrayList<>();
    List<Integer> level = new ArrayList<>();

    t.inorder(t.root, in);
    t.preorder(t.root, pre);
    t.postorder(t.root, post);
    level = t.levelOrder(t.root);

    System.out.println("Inorder: "+in);
    System.out.println("Preorder: "+pre);
    System.out.println("Postorder: "+post);
    System.out.println("Level order: "+level);
  }
}
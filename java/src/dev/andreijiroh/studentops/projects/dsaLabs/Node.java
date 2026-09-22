package dev.andreijiroh.studentops.projects.dsaLabs;

/**
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/Node.java
 */
class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}
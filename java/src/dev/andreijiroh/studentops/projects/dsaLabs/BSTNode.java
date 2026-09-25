package dev.andreijiroh.studentops.projects.dsaLabs;

/**
 * 03 Laboratory Exercise 2 - Data Strucutres and Algorithms
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/BSTNode.java
 */
class BSTNode {
  int key;
  BSTNode left;
  BSTNode right;

  BSTNode(int key) {
    this.key = key;
    left = null;
    right = null;
  }
}

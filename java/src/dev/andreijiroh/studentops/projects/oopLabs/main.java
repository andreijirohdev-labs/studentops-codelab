package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 02 Performance Task 1 - Data Structures and Algorithms
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
 class Node {
    String data;
    Node next;

    public Node(String data) {
      this.data = data;
      this.next = null;
    }
 }

 public class main {
   public static void main(String[] args) {
    // Init 3 entries first
    Node track = new Node("Song A");
    track.next = new Node("Song B");
    track.next.next = new Node("Song C");
    Node initialHead = track;
    System.out.println("Initial state:");
    while (initialHead != null) {
      System.out.print(initialHead.data + " -> ");
      initialHead = initialHead.next;
    }
    System.out.print("null");
    System.out.println();

    // add Song D to the tracks queue
    track.next.next.next = new Node("Song D");
    Node addedNewNode = track;
    System.out.println("After adding Song D:");
    while (addedNewNode != null) {
      System.out.print(addedNewNode.data + " -> ");
      addedNewNode = addedNewNode.next;
    }
    System.out.print("null");
   }
 }

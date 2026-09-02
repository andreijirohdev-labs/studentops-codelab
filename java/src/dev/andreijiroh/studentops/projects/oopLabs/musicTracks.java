package dev.andreijiroh.studentops.projects.oopLabs;

/**
 * 02 Performance Task 1 - Data Structures and Algorithms
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

/**
 * The node class itself in a nutshell for single-linked lists/arrays
 */
class Node {
  String data;
  Node next;

  public Node(String data) {
    this.data = data;
    this.next = null;
  }
}

public class musicTracks {
  /**
   * This function is taken from https://www.geeksforgeeks.org/dsa/delete-a-linked-list-node-at-a-given-position/,
   * using the single traversal deletion method (the expected/wired part) rather than storing everything in
   * another array (tired/naive/obvious part).
   * @see https://www.geeksforgeeks.org/dsa/delete-a-linked-list-node-at-a-given-position/
   */
  public static Node deleteTrackFromQueue(Node head, int x) {
    Node tempData = head;

    /**
     * Case 1: If the head is going to be nuked off the queue
     */
    if (x == 1) {
      head = tempData.next;
      tempData = null;
      return head;
    }

    /**
     * Case 2: Traverse to the node before the one to be deleted
     */
    Node prev = null;
    for (int i =1; i < x; i++) {
      prev = tempData;
      tempData = tempData.next;
    }

    /**
     * Case 2 (cont'd): Delete that node in question at position x
     */
    prev.next = tempData.next;
    tempData = null;

    return head;
  }

  /**
   * Rather than doing the logging part of the resulting list individually after each operation,
   * we'll use this fuction instead to keep things clean.
   * @param head The linked list to print into console
   * @param section Section name for the list
   */
  public static void printListWithSection(Node head, String section) {
    System.out.println(section);
    while (head != null) {
      System.out.print(head.data + " -> ");
      head = head.next;
    }
    System.out.print("null");
    System.out.println("");
    System.out.println("");
  }

  public static void main(String[] args) {
    // Init 3 entries first
    Node track = new Node("Song A");
    track.next = new Node("Song B");
    track.next.next = new Node("Song C");
    Node initialHead = track;
    printListWithSection(initialHead, "Initial state:");

    // add Song D to the tracks queue
    track.next.next.next = new Node("Song D");
    Node addedNewNode = track;
    printListWithSection(addedNewNode, "After adding song D to queue:");

    // clean up Song B
    int trackToNuke = 2;
    Node cleanup = deleteTrackFromQueue(addedNewNode, trackToNuke);
    printListWithSection(cleanup, "After removing song B from queue:");
  }
}

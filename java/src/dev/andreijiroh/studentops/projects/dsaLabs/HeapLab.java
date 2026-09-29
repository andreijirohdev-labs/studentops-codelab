package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.*;

/**
* 04 Laboratory Exercise 1 - Data Structures and Algorithms
*
* @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
* @see https://gitlab.com/andreijiroh-dev/labs/studentops-codelab/-/blob/main/java/src/dev/andreijiroh/studentops/projects/dsaLabs/HeapLab.java
*/

/**
* Class for holding the needed data for an incident.
 */
class Incident {
    int id;
    String location;
    int severity;

    public Incident(int id, String location, int severity) {
        this.id = id;
        this.location = location;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return id + " - " + location + " (Severity: " + severity + ")";
    }
}

/**
* The main class itself for the laboratory exerice in heaps.
 */
public class HeapLab {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int baseId = 100;

    // Max-Heap: Highest severity first
    PriorityQueue<Incident> maxHeap = new PriorityQueue<>(
        (a, b) -> Integer.compare(b.severity, a.severity)
    );

    // Min-Heap: Lowest severity first
    PriorityQueue<Incident> minHeap = new PriorityQueue<>(
        (a, b) -> Integer.compare(a.severity, b.severity)
    );

    System.out.print("Enter number of incidents: ");
    int numberOfIncidents = input.nextInt();
    input.nextLine();

    // Input incidents
    for (int i = 1; i <= numberOfIncidents; i++) {
        String location;
        int severity;
        int id = baseId + i;
        System.out.print(id + " - Enter location: ");
        location = input.nextLine();

        /**
         * Adapted from polygenelubricants' Stack Overflow answer at https://stackoverflow.com/a/3059367
         * for validating the provided severity against supported range.
         */
        do {
          System.out.print(id + " - Enter severity (1-10): ");
          while (!input.hasNextInt()) {
            System.out.print(id + " Enter severity within the range (1-10): ");
            input.next();
          }
          severity = input.nextInt();
        } while (severity < 1 || severity > 10);
        input.nextLine();

        Incident incident = new Incident(id, location, severity);

        // Add to both heaps
        maxHeap.add(incident);
        minHeap.add(incident);
    }

    // Display Max-Heap order
    System.out.println("\nDispatch Order (Max-Heap)");

    while (!maxHeap.isEmpty()) {
        Incident incident = maxHeap.poll();
        System.out.println(incident);
    }

    // Display Min-Heap order
    System.out.println("\nBacklog Monitoring (Min-Heap)");

    while (!minHeap.isEmpty()) {
        Incident incident = minHeap.poll();
        System.out.println(incident);
    }

    input.close();
  }
}

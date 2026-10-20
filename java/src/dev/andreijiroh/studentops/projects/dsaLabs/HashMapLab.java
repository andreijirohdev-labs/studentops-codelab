package dev.andreijiroh.studentops.projects.dsaLabs;
import java.util.HashMap;

public class HashMapLab {
  public static void main(String[] args) {
    HashMap<String, Integer> hashTable = new HashMap<>();

    hashTable.put("apple", 10);
    hashTable.put("banana", 20);
    hashTable.put("grape", 30);
    
    System.out.println("apple: " + hashTable.get("apple"));
    System.out.println("banana: " + hashTable.get("banana"));
    
    if (hashTable.containsKey("cherry")) {
      System.out.println("cherry: " + hashTable.get("cherry"));
    } else {
      System.out.println("cherry not found!");
    }

    hashTable.remove("grape");
    System.out.println("Hash table contents: " + hashTable);
  }
}
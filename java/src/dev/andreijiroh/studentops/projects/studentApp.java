package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - 01 Activity 1
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */

class Student {
  String name;
  int age;

  Student (String name, int age) {
    this.name = name;
    this.age = age;
  };

  void introduce() {
    System.out.println("Hi, I am "+name+", and I'm "+age+" years old.");
  }

  public static void main(String[] args) {
    Student s1 = new Student("Andrei Jiroh Halili", 20);
    Student s2 = new Student("Alice", 20); 
    Student s3 = new Student("Bob", 22); 
    
    s1.introduce();
    s2.introduce();
    s3.introduce();
  };
}

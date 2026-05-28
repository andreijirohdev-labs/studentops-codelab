package dev.andreijiroh.studentops.projects;

public class helloGenerics {
  public static void main(String[] args) {
    class helloGen<T> {
      private T data;

       public void setValue(T dt) {  
        data = dt; 
      }

      public void showType() {
        System.out.println("Type of T is " + data.getClass().getName()); 
      }

       public T getValue(){  
        return data; 
      }
    }
    
    helloGen<String> name = new helloGen<>();
    name.setValue("Andrei Jiroh Halili");
    name.showType();
    
    helloGen<String> section = new helloGen<>();
    section.setValue("BSIT102B");
    section.showType();

    helloGen<String> course = new helloGen<>();
    course.setValue("BSIT");
    course.showType();

    System.out.println("Name: " + name.getValue());
    System.out.println("Section: " + section.getValue());
    System.out.println("Course: " + course.getValue());
  }
}

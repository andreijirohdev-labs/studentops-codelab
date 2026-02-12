package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 1 - Lab 1
 * 
 * Note that since classes are nested, we need to add static instead of individually do
 * `public static void` on both `Biodata` and `Manager` classes.
 * 
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 * @see https://stackoverflow.com/questions/9560600/what-causes-error-no-enclosing-instance-of-type-foo-is-accessible-and-how-do-i#9560633
 */
class Comprog2_Lab1 {
  static class Biodata {
    String name;
    int age;
    String emailUsername;

    Biodata(String name, int age, String emailUsername) {
      this.name = name;
      this.age = age;
      this.emailUsername = emailUsername;
    }

    void introduce() {
      System.out.println("Goodday, I am "+name+", "+age+" years old and my email is "+emailUsername+"@lairland.is-a.dev.");
    }
  }

  static class Manager {
    String name;
    int age;
    String position;
    String organization;

    Manager (String name, int age, String position, String organization) {
      this.name = name;
      this.age = age;
      this.organization = organization;
      this.position = position;
    }

    void introduce() {
      System.out.println("Hi, I am "+name+", "+age+" years old, the "+position+" of "+organization);
    }
  }

  public static void main(String[] args) {
    Biodata crew1 = new Biodata("George", 21, "labs.george");
    Biodata crew2 = new Biodata("Gina", 23, "labs.gina");
    Biodata crew3 = new Biodata("Kevin", 22, "labs.kevin");
    Manager hr = new Manager("Gina",37,"HR","ABC Company");

    crew1.introduce();
    crew2.introduce();
    crew3.introduce();
    hr.introduce();
  }
}

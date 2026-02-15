package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 2 - 02 Laboratory Exercise
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
interface Self {
  void introduce();
};

class Halili implements Self {
  int age;
  String[] interests;
  String[] skills;

  public void introduce() {
    this.age = age;
    this.interests = interests;
    this.skills = skills;

    System.out.println("Age: "+age);
    System.out.println("Interests");
    for (int i = 0; i < interests.length; i++) {
      System.out.println("- "+interests[i]);
    }
    System.out.println("Skills");
    for (int i = 0; i < skills.length; i++) {
      System.out.println("- "+skills[i]);
    }
  };
}

class AndreiJiroh extends Halili {
  String website;
  String[] socials;

  public void webAndSocials() {
    System.out.println("Website: "+website);
    System.out.println("Socials:");
    for (int i = 0; i < socials.length; i++) {
      System.out.println("- "+socials[i]);
    }
  }
};

class ComProg2_Lab2_v3 {
  public static void main(String[] args) {
    int age = 20;
    String[] interests = {"Nixpkgs/Nix/NixOS","electronic music","Minecraft"};
    String[] skills = {"Backend development in TypeScript", "Linux shell scripting"};
    String website = "https://andreijiroh.dev";
    String[] socials = {"https://tilde.zone/@ajhalili2006", "https://bsky.app/profile/andreijiroh.dev", "https://instagram.com/ajhalili2006", "https://youtube.com/@ajhalili2006", "https://x.com/ajhalili2006"};
    
    AndreiJiroh self = new AndreiJiroh();
    self.age = age;
    self.interests = interests;
    self.skills = skills;
    self.website = website;
    self.socials = socials;
    self.introduce();
    self.webAndSocials();
  }
}
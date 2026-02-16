package dev.andreijiroh.studentops.projects;

/**
 * Computer Programming 2 - 02 Laboratory Exercise
 * v2 - method overriding
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
class ComProg2_Lab2_v2 {

  /**
   * Our basic interface for introducing ourselves
   */
  interface Self {
    void introduce();
  };

  /**
   * The extender part of the initial interface
   */
  interface Self_addon extends Self {
    void webAndSocials();
  }

  static class Halili implements Self {
    int age;
    String[] interests;
    String[] skills;

    public void introduce() {
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

  static class AndreiJiroh extends Halili implements Self_addon {
    String website;
    String[] socials;
    /**
     * If pronouns are unknown, use they/them in the meanwhile.
     */
    String pronouns = "they/them";
    String hometown;

    @Override
    public void introduce() {
      System.out.println("Age: "+age);
      System.out.println("Pronouns: "+pronouns);
      System.out.println("Hometown: "+hometown);

      System.out.println("Interests");
      for (int i = 0; i < interests.length; i++) {
        System.out.println("- "+interests[i]);
      }
      System.out.println("Skills");
      for (int i = 0; i < skills.length; i++) {
        System.out.println("- "+skills[i]);
      }
    }

    public void webAndSocials() {
      System.out.println("Website: "+website);
      System.out.println("Socials:");
      for (int i = 0; i < socials.length; i++) {
        System.out.println("- "+socials[i]);
      }
    }
  };

  public static void main(String[] args) {
    int age = 20;
    String pronouns = "he/they";
    String[] interests = {"Nixpkgs/Nix/NixOS","electronic music","Minecraft"};
    String[] skills = {"Backend development in TypeScript", "Linux shell scripting", "Technical documentation writing", "DevOps with Docker and GitHub Actions + GitLab Ci"};
    String website = "https://andreijiroh.dev";
    String[] socials = {"https://tilde.zone/@ajhalili2006", "https://bsky.app/profile/andreijiroh.dev", "https://instagram.com/ajhalili2006", "https://youtube.com/@ajhalili2006", "https://x.com/ajhalili2006"};
    String hometown = "Marilao, Bulacan, Philippines";
    
    AndreiJiroh self = new AndreiJiroh();
    self.age = age;
    self.interests = interests;
    self.skills = skills;
    self.website = website;
    self.socials = socials;
    self.pronouns = pronouns;
    self.hometown = hometown;
    self.introduce();
    self.webAndSocials();
  }
}

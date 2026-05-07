package dev.andreijiroh.studentops.projects;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * PETA activity 2 code for lab exercise on 2026-03-26
 * @author Andrei Jiroh Halili (STI College Meycauayan) <halili.459491@meycauayan.sti.edu.ph>
 */
public class PETA_labs_20260326_activity2 {
  static class Student {
    String name = "Andrei Jiroh Halili";
    int studentId = 2000459491;

    class Profile {
      String course = "BS in Information Technology";
      String yearLevel = "1Y2";
    }

    void showInfo() {
      /* Obviously auto-completed by Gemini on Firebase Studio (aka VS Code for Web) */
      System.out.println("Name: "+name);
      System.out.println("Student ID: "+studentId);
      System.out.println("Course: "+new Profile().course);
      System.out.println("Year Level: "+new Profile().yearLevel);
    }
  }

  public static void main(String[] args) {
    Student studentOpsInfo = new Student();
    studentOpsInfo.showInfo();
  }
}

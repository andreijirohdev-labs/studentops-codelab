package dev.andreijiroh.studentops.projects.oopLabs.smartCampusLabs;

public class Main {
  public static void main(String[] args) {
    SmartDeskLamp lamp = new SmartDeskLamp("Registrar Office Desk", 100);
    WirelessEarbud earbud = new WirelessEarbud("Registrar Staff Earbuds", 100);

    SmartDevice[] devices = { lamp, earbud };

    for (SmartDevice device: devices) {
      System.out.println("==================================================");
      device.powerOn();
      device.connect();
      device.showDeviceInfo();
      System.out.println("==================================================");
      System.out.println("");
    }

    earbud.charge(15);
    earbud.playAudio("Campus Lofi");
  }
}

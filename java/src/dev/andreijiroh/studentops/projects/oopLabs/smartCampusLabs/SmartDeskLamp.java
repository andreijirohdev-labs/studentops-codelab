package dev.andreijiroh.studentops.projects.oopLabs.smartCampusLabs;

public class SmartDeskLamp extends SmartDevice {
  private Boolean isConnected = false;
  private Boolean isPoweredOn = false;

  public SmartDeskLamp(String deviceName, int batteryLevel) {
    super(
      (deviceName != null) ? deviceName : "School Library - Smart Desk Lamp 001",
      (batteryLevel != 0) ? batteryLevel : 100);
  }

  @Override
  public void powerOn() {
    if (isPoweredOn == true) {
      System.out.println("Already powered on");
      return;
    }

    isPoweredOn = true;
    System.out.println("Successfully powered on");
  }

  @Override
  public void connect() {
    if (isConnected == true) {
      System.out.println("Already connected");
      return;
    }

    isConnected = true;
    System.out.println("Smart desk lamp successfully connected.");
  }

  @Override
  public String getStatus() {
    if (isConnected != false) {
      return "Not yet connected";
    }
    return "Connected";
  }

}

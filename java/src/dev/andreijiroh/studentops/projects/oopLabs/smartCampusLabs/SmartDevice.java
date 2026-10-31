package dev.andreijiroh.studentops.projects.oopLabs.smartCampusLabs;

public abstract class SmartDevice implements Connectable {
    private String deviceName;
    private int batteryLevel;

    public SmartDevice(String deviceName, int batteryLevel) {
      this.deviceName = deviceName;
      this.batteryLevel = batteryLevel;
    }

    public void showDeviceInfo() {
      System.out.println("Device name: "+deviceName);
      System.out.println("Current batter level: "+batteryLevel+"%");
    }
    public abstract void powerOn();
}

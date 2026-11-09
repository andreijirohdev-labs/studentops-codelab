package dev.andreijiroh.studentops.projects.oopLabs.smartCampusLabs;

public class WirelessEarbud extends SmartDevice implements Rechargeable, Playable {
  private Boolean isConnected = false;
  private Boolean isPoweredOn = false;
  private String track;

  public WirelessEarbud(String deviceName, int batteryLevel) {
    super(
      (deviceName != null) ? deviceName : "Personal Wireless Earbuds",
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
    System.out.println("Wireless earbuds successfully connected. Keep within "+ MAX_RANGE_METERS + " meters between devices to stay connected.");
  }

  @Override
  public void charge(int minutes) {
      System.out.println("Charging for "+minutes+" minutes");
      
  }

  @Override
  public void playAudio(String trackName) {
    this.track = trackName;
    System.out.println("Now playing: "+ trackName);
  }

  @Override
  public String getStatus() {
    if (isPoweredOn == false) {
        return "Powered off";
    }

    if (isPoweredOn && isConnected == false) {
      return "Powered on but not yet connected";
    }

    return (track != null )? "Connected and listening to " + track : "Connected";
  }
}

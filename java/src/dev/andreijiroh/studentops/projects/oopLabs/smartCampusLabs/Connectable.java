package dev.andreijiroh.studentops.projects.oopLabs.smartCampusLabs;

public interface Connectable {
  public static final int MAX_RANGE_METERS = 10;
  void connect();
  public abstract String getStatus();
}

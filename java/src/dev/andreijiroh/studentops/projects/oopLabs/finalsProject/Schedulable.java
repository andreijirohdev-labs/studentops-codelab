package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

public interface Schedulable {
    TimeSlot getSlot();
    void reschedule(TimeSlot newSlot);
}

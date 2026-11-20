package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.time.LocalDateTime;

public final class TimeSlot {
    private final LocalDateTime start;
    private final int minutes;

    public TimeSlot(LocalDateTime start, int minutes) {
        Validate.required(start, "start");
        if (minutes <= 0) {
            throw new IllegalArgumentException("minutes must be positive");
        }
        this.start = start;
        this.minutes = minutes;
    }

    public LocalDateTime getStart() { return start; }
    public int getMinutes() { return minutes; }
    public LocalDateTime getEnd() { return start.plusMinutes(minutes); }

    public boolean overlaps(TimeSlot other) {
        return start.isBefore(other.getEnd()) && other.getStart().isBefore(getEnd());
    }

    @Override
    public String toString() {
        return start + " for " + minutes + " min";
    }
}

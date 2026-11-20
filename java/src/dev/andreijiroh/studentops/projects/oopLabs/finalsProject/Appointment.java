package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.math.BigDecimal;

public abstract class Appointment implements Identifiable, Schedulable {

    public enum Status { SCHEDULED, COMPLETED, CANCELLED, NO_SHOW }

    private final String id;
    private final Doctor doctor;
    private final Patient patient;
    private TimeSlot slot;
    private Status status = Status.SCHEDULED;
    private String notes = "";

    protected Appointment(String id, Doctor doctor, Patient patient, TimeSlot slot) {
        this.id = Validate.notBlank(id, "id");
        Validate.required(doctor, "doctor");
        Validate.required(patient, "patient");
        Validate.required(slot, "slot");
        this.doctor = doctor;
        this.patient = patient;
        this.slot = slot;
    }

    @Override
    public String getId() { return id; }

    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }

    @Override
    public TimeSlot getSlot() { return slot; }

    @Override
    public void reschedule(TimeSlot newSlot) {
        if (status != Status.SCHEDULED) {
            throw new IllegalStateException("only a scheduled appointment can move");
        }
        Validate.required(newSlot, "newSlot");
        this.slot = newSlot;
    }

    public Status getStatus() { return status; }
    public String getNotes() { return notes; }

    public void complete(String notes) {
        if (status != Status.SCHEDULED) {
            throw new IllegalStateException("appointment is already " + status);
        }
        this.status = Status.COMPLETED;
        this.notes = notes == null ? "" : notes.trim();
    }

    public void cancel(String reason) {
        if (status != Status.SCHEDULED) {
            throw new IllegalStateException("appointment is already " + status);
        }
        this.status = Status.CANCELLED;
        this.notes = reason == null ? "" : reason.trim();
    }

    public void markNoShow() {
        if (status != Status.SCHEDULED) {
            throw new IllegalStateException("appointment is already " + status);
        }
        this.status = Status.NO_SHOW;
    }

    /** What the clinic charges. Each subclass decides. */
    public abstract BigDecimal fee();

    /** Shown in the appointment list. Each subclass decides. */
    public abstract String kind();
}

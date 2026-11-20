package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.math.BigDecimal;

public class CheckUpAppointment extends Appointment {
    public CheckUpAppointment(String id, Doctor doctor, Patient patient, TimeSlot slot) {
        super(id, doctor, patient, slot);
    }

    @Override
    public BigDecimal fee() {
        return getDoctor().getConsultationFee();
    }

    @Override
    public String kind() {
        return "Check-up";
    }
}

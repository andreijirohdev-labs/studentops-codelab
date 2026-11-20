package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FollowUpAppointment extends Appointment {
    private final String previousAppointmentId;

    public FollowUpAppointment(String id, Doctor doctor, Patient patient,
                               TimeSlot slot, String previousAppointmentId) {
        super(id, doctor, patient, slot);
        this.previousAppointmentId = Validate.notBlank(previousAppointmentId, "previousAppointmentId");
    }

    public String getPreviousAppointmentId() { return previousAppointmentId; }

    @Override
    public BigDecimal fee() {
        // follow-ups are charged at half the consultation fee
        return getDoctor().getConsultationFee()
                .multiply(new BigDecimal("0.5"))
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String kind() {
        return "Follow-up";
    }
}

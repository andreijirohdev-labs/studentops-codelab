package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AppointmentService {
    private final Map<String, Doctor> doctors = new LinkedHashMap<>();
    private final Map<String, Patient> patients = new LinkedHashMap<>();
    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        Validate.required(repository, "repository");
        this.repository = repository;
    }

    public void registerDoctor(Doctor doctor) {
        doctors.put(doctor.getId(), doctor);
    }

    public void registerPatient(Patient patient) {
        patients.put(patient.getId(), patient);
    }

    public Appointment book(Appointment appointment) {
        if (!doctors.containsKey(appointment.getDoctor().getId())) {
            throw new IllegalArgumentException("unknown doctor " + appointment.getDoctor().getId());
        }
        if (!patients.containsKey(appointment.getPatient().getId())) {
            throw new IllegalArgumentException("unknown patient " + appointment.getPatient().getId());
        }
        if (isSlotTaken(appointment.getDoctor().getId(), appointment.getSlot())) {
            throw new IllegalStateException("doctor already has an appointment in that slot");
        }
        repository.save(appointment);
        return appointment;
    }

    public void cancel(String appointmentId, String reason) {
        Appointment appointment = repository.findById(appointmentId)
                .orElseThrow(() -> new IllegalArgumentException("unknown appointment " + appointmentId));
        appointment.cancel(reason);
    }

    public List<Appointment> agendaFor(String doctorId) {
        return repository.findByDoctor(doctorId);
    }

    public List<Person> everyone() {
        List<Person> people = new ArrayList<>();
        people.addAll(doctors.values());
        people.addAll(patients.values());
        return people;
    }

    private boolean isSlotTaken(String doctorId, TimeSlot slot) {
        for (Appointment existing : repository.findByDoctor(doctorId)) {
            if (existing.getStatus() == Appointment.Status.SCHEDULED
                    && existing.getSlot().overlaps(slot)) {
                return true;
            }
        }
        return false;
    }
}

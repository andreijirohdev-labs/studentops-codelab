package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.util.List;
import java.util.Optional;

public interface AppointmentRepository {
    void save(Appointment appointment);
    Optional<Appointment> findById(String id);
    List<Appointment> findByDoctor(String doctorId);
    List<Appointment> findByPatient(String patientId);
    List<Appointment> findAll();
    void delete(String id);
}

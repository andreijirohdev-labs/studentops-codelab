package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryAppointmentRepository implements AppointmentRepository {
    private final Map<String, Appointment> byId = new LinkedHashMap<>();

    @Override
    public void save(Appointment appointment) {
        byId.put(appointment.getId(), appointment);
    }

    @Override
    public Optional<Appointment> findById(String id) {
        return Optional.ofNullable(byId.get(id));
    }

    @Override
    public List<Appointment> findByDoctor(String doctorId) {
        return byId.values().stream()
                .filter(a -> a.getDoctor().getId().equals(doctorId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Appointment> findByPatient(String patientId) {
        return byId.values().stream()
                .filter(a -> a.getPatient().getId().equals(patientId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Appointment> findAll() {
        return new ArrayList<>(byId.values());
    }

    @Override
    public void delete(String id) {
        byId.remove(id);
    }
}

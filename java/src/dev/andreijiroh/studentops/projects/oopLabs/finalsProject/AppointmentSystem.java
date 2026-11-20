package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class AppointmentSystem {

    public static void main(String[] args) {
        AppointmentService clinic = new AppointmentService(new InMemoryAppointmentRepository());
        Scanner scanner = new Scanner(System.in);

        // Full constructor, then the short one, which chains through super(...)
        Doctor cardiologist = new Doctor("D-01", "Maria Santos", "0917-555-0101",
                "PRC-123456", Specialization.CARDIOLOGY, new BigDecimal("800.00"));
        Doctor pediatrician = new Doctor("D-02", "Jose Reyes", "PRC-223344",
                Specialization.PEDIATRICS);

        clinic.registerDoctor(cardiologist);
        clinic.registerDoctor(pediatrician);

        Patient juan = new Patient("P-01", "Juan Cruz", "0918-555-0202");
        Patient ana = new Patient("P-02", "Ana Lim", "0919-555-0303", "PH-88112233");

        clinic.registerPatient(juan);
        clinic.registerPatient(ana);

        LocalDateTime monday = LocalDateTime.of(2026, 11, 24, 9, 0);

        Appointment checkUp = clinic.book(new CheckUpAppointment(
                "A-01", cardiologist, juan, new TimeSlot(monday, 30)));
        clinic.book(new FollowUpAppointment(
                "A-02", cardiologist, juan, new TimeSlot(monday.plusDays(7), 20), checkUp.getId()));
        clinic.book(new CheckUpAppointment(
                "A-03", pediatrician, ana, new TimeSlot(monday.plusHours(2), 30)));

        printAgenda(clinic, cardiologist);
        printAgenda(clinic, pediatrician);

        // The service refuses the clash, the caller does not have to check
        try {
            clinic.book(new CheckUpAppointment(
                    "A-04", cardiologist, ana, new TimeSlot(monday.plusMinutes(15), 30)));
        } catch (IllegalStateException refused) {
            System.out.println("\nrefused: " + refused.getMessage());
        }

        clinic.cancel("A-03", "patient unwell");

        printAgenda(clinic, cardiologist);
        printAgenda(clinic, pediatrician);

        // One list, two implementations of describe()
        System.out.println("\nRegistered people:");
        for (Person person : clinic.everyone()) {
            System.out.println("  " + person.describe()
                    + "  [" + person.getClass().getSimpleName() + "]");
        }

        scanner.close();
    }

    private static void printAgenda(AppointmentService clinic, Doctor doctor) {
        System.out.println("\nAgenda for " + doctor.describe());
        List<Appointment> agenda = clinic.agendaFor(doctor.getId());

        if (agenda.isEmpty()) {
            System.out.println("  nothing booked");
            return;
        }

        BigDecimal scheduledTotal = BigDecimal.ZERO;
        for (Appointment appointment : agenda) {
            System.out.println("  " + appointment.getId()
                    + "  " + appointment.getSlot()
                    + "  " + appointment.kind()
                    + "  PHP " + appointment.fee()
                    + "  " + appointment.getStatus());

            if (appointment.getStatus() == Appointment.Status.SCHEDULED) {
                scheduledTotal = scheduledTotal.add(appointment.fee());
            }
        }
        System.out.println("  scheduled total: PHP " + scheduledTotal);
    }
}

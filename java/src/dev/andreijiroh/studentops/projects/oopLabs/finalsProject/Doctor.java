package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

import java.math.BigDecimal;

public class Doctor extends Person {
    public static final BigDecimal DEFAULT_FEE = new BigDecimal("500.00");

    private final String licenseNumber;
    private final Specialization specialization;
    private final BigDecimal consultationFee;

    public Doctor(String id, String name, String contactNumber,
                  String licenseNumber, Specialization specialization, BigDecimal consultationFee) {
        super(id, name, contactNumber);
        this.licenseNumber = Validate.notBlank(licenseNumber, "licenseNumber");
        Validate.required(specialization, "specialization");
        if (consultationFee == null || consultationFee.signum() < 0) {
            throw new IllegalArgumentException("consultationFee must be zero or more");
        }
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public Doctor(String id, String name, String licenseNumber, Specialization specialization) {
        this(id, name, "n/a", licenseNumber, specialization, DEFAULT_FEE);
    }

    public String getLicenseNumber() { return licenseNumber; }
    public Specialization getSpecialization() { return specialization; }
    public BigDecimal getConsultationFee() { return consultationFee; }

    @Override
    public String describe() {
        return "Dr. " + getName() + ", " + specialization + " (lic. " + licenseNumber + ")";
    }
}

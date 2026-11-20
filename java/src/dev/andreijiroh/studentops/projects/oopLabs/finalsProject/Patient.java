package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

public class Patient extends Person {
    private final String philhealthNumber;

    public Patient(String id, String name, String contactNumber) {
        this(id, name, contactNumber, null);
    }

    public Patient(String id, String name, String contactNumber, String philhealthNumber) {
        super(id, name, contactNumber);
        this.philhealthNumber = philhealthNumber;
    }

    public String getPhilhealthNumber() { return philhealthNumber; }

    @Override
    public String describe() {
        return getName() + " (" + getId() + ")";
    }
}

package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

public abstract class Person implements Identifiable {
    private final String id;
    private String name;
    private String contactNumber;

    protected Person(String id, String name, String contactNumber) {
        this.id = Validate.notBlank(id, "id");
        setName(name);
        setContactNumber(contactNumber);
    }

    @Override
    public String getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = Validate.notBlank(name, "name");
    }

    public String getContactNumber() { return contactNumber; }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = Validate.notBlank(contactNumber, "contactNumber");
    }

    public abstract String describe();
}

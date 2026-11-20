package dev.andreijiroh.studentops.projects.oopLabs.finalsProject;

final class Validate {
    private Validate() {}

    static String notBlank(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value.trim();
    }

    static <T> void required(T value, String field) {
        if (value == null) {
            throw new IllegalArgumentException(field + " is required");
        }
    }
}

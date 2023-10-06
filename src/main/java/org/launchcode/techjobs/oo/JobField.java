package org.launchcode.techjobs.oo;

import java.util.Objects;


abstract class JobField {
    // Common fields between the four classes
    public int id;
    public static int nextId = 1;
    public String value;

    // Empty constructor to increment Id for the classes
    public JobField(String value) {
        id = nextId;
        nextId++;
        this.value = value;
    }

    // Common constructors

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Common Getters/Setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

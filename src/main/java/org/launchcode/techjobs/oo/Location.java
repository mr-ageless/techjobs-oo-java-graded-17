package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    //Initialize the id field from the empty Location constructor, assign it to the value field, new Location objects will use the value inside the value field
//    public Location(String value) {
//        this();
//        this.value = value;
//    }

    public Location(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

}

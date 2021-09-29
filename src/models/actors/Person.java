package models.actors;

import models.data.Phone;
import models.structures.Hospital;

import java.util.Set;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String fullName;
    private String gender;
    private String birthDate;
    private String address;
    private Phone phone;
    private String bloodGroup;

    private Set<Hospital> hospitals;

    public void displayInformation(){};
}

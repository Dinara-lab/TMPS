package models.actors;

import models.actors.abstractions.DoctorDetails;
import models.data.personal_info.Phone;
import models.structures.Hospital;

import java.util.Set;

public class Person implements DoctorDetails {

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

    @Override
    public void viewDoctors() {

    }

    @Override
    public void viewMedicine() {

    }

    @Override
    public void viewDoctorSchedule() {

    }
}

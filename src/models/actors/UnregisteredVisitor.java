package models.actors;

import models.actors.abstractions.DoctorDetails;
import abstract_factory.factories.abstractions.IPatientStaff;

public class UnregisteredVisitor implements DoctorDetails, IPatientStaff {

    private String name = "UnregisteredVisitor";
    public void register(){};

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UnregisteredVisitor{" +
                "name='" + name + '\'' +
                '}';
    }

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

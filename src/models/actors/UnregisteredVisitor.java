package models.actors;

import lab2.decorator.PatientMedicalRecord;
import models.actors.abstractions.DoctorDetails;
import lab1.factories.abstractions.IPatientStaff;
import models.data.BasicMedicalRecord;
import models.data.PatientDemographics;

public class UnregisteredVisitor implements DoctorDetails, IPatientStaff {

    private String name = "UnregisteredVisitor";
    public static void register(){
        System.out.println("New visitor was registered");
    };

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UnregisteredVisitor{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void getMedicalRecord(){
        PatientMedicalRecord patientDemographics = new PatientDemographics(new BasicMedicalRecord());
        patientDemographics.record();
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

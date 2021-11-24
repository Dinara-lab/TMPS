package models.actors;

import models.data.medicalLab.LabTestWork;
import models.data.medical_records.abstractions.PatientMedicalRecord;
import models.actors.abstractions.DoctorDetails;
import factories.abstractions.IPatientStaff;
import java.util.ArrayList;

public class UnregisteredVisitor implements DoctorDetails, IPatientStaff {

    private String name = "UnregisteredVisitor";
    private int age = 30;
    private String email = "user123@gmail.com";

    public static void register(){
        System.out.println("New visitor was registered");
    };


    @Override
    public String toString() {
        return "UnregisteredVisitor{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void getInformation(UnregisteredVisitor visitor) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(visitor.name);
        list.add(visitor.age);
        list.add(visitor.email);
        System.out.println(list);
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


    @Override
    public void setMedicalRecord(PatientMedicalRecord patientMedicalRecord) {

    }

    @Override
    public void makeAppointment() {
        System.out.println("The appointment was made for the visitor");

    }

    @Override
    public void setLabTest(LabTestWork labTestWork) {

    }

    @Override
    public void getPersonalInformation(String person) {
        IPatientStaff.super.getPersonalInformation(person);
    }
}

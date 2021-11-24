package models.actors;

import factories.abstractions.IPatientStaff;
import models.data.medicalLab.LabTestWork;
import models.data.medical_records.abstractions.PatientMedicalRecord;
import models.actors.abstractions.DoctorDetails;

import java.util.ArrayList;

public class Patient extends Person implements DoctorDetails, IPatientStaff {
    private String pName = "Patient";
    private int id = 1;
    private int age = 25;


    public static void getInformation(Patient patient){
        ArrayList<Object> list = new ArrayList<>();
        list.add(patient.id);
        list.add(patient.age);
        list.add(patient.pName);
        System.out.println(list);
    }

    public static void register(){
        System.out.println("Patient was registered");
    };


    @Override
    public String toString() {
        return "Patient{" +
                "pName='" + pName + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public  void viewDoctors() {
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
        System.out.println("The appointment was made for the patient");

    }

    @Override
    public void setLabTest(LabTestWork labTestWork) {

    }
}

package models.actors;

import abstract_factory.factories.abstractions.IMedicineStaff;
import models.data.Diagnose;
import models.data.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Doctor extends Staff implements IMedicineStaff {
    private String dName = "Doctor";
    private String dAddress;
    private Phone dPhone;
    private String dSpeciality;
    private String qualifications;
    private Set<Diagnose> diagnoses;
    private final List<Patient> patientList = new ArrayList<>();
    public void displayDoctorInfo(){};
    public void prescribeMed(){};
    public void prescribeTest(){};
    public void scheduleAppointment(){};
    public void timeSlot(){};

    @Override
    public String toString() {
        return "Doctor{" +
                "dName='" + dName + '\'' +
                ", dAddress='" + dAddress + '\'' +
                ", dPhone=" + dPhone +
                ", dSpeciality='" + dSpeciality + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", diagnoses=" + diagnoses +
                ", patientList=" + patientList +
                '}';
    }
}

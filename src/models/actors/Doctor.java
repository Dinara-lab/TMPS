package models.actors;

import lab1.factories.abstractions.IMedicineStaff;
import models.data.Diagnose;
import models.data.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Doctor extends Staff implements IMedicineStaff {
    private String dName = "Doctor";
    private String dAddress;
    private Phone dWorkPhone = Phone.phoneClone();
    private String dSpeciality;
    private String qualifications;
    private Set<Diagnose> diagnoses;
    private final List<Patient> patientList = new ArrayList<>();
    public void displayDoctorInfo(){};
    public void prescribeMed(){};
    public void prescribeTest(){};
    public void scheduleAppointment(){};
    public void timeSlot(){};

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public Phone getdPhone() {
        return dWorkPhone;
    }

    public void setdPhone(Phone dPhone) {
        this.dWorkPhone= dPhone;
    }

    public String getdSpeciality() {
        return dSpeciality;
    }

    public void setdSpeciality(String dSpeciality) {
        this.dSpeciality = dSpeciality;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public Set<Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dName='" + dName + '\'' +
                ", dAddress='" + dAddress + '\'' +
                ", dWorkPhone=" + dWorkPhone+
                ", dSpeciality='" + dSpeciality + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", diagnoses=" + diagnoses +
                ", patientList=" + patientList +
                '}';
    }
}

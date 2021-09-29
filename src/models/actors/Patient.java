package models.actors;

import abstract_factory.factories.abstractions.IPatientStaff;
import models.data.Diagnose;
import models.data.Email;
import models.data.Phone;
import models.actors.abstractions.DoctorDetails;

public class Patient extends Person implements DoctorDetails, IPatientStaff {
    private String pName = "Patient";
    private String id;
    private int age;
    private Email email;
    private Phone contactNo;
    private Diagnose diagnose;

    public void login(){};
    public void updateInfo(){};
    public void logout(){};
    public void makeAppointment(){};
    public void cancelAppointment(){};
    public void viewBill(){};
    public void viewPrescription(){};
    public void viewLabTestResults(){};

    public String getpName() {
        return pName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pName='" + pName + '\'' +
                ", id='" + id + '\'' +
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

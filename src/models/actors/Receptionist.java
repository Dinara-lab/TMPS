package models.actors;

import abstract_factory.factories.abstractions.IAdministrationStaff;
import models.data.Payment;

import java.util.List;

public class Receptionist extends AdministrativeStaff implements IAdministrationStaff {
    private String name = "Receptionist";
    private String Pos = "pos";
    private List<Payment> paymentList;

    @Override
    public String toString() {
        return "Receptionist{" +
                "name='" + name + '\'' +
                ", Pos='" + Pos + '\'' +
                ", paymentList=" + paymentList +
                '}';
    }

    public void displayCashManagement(){};
    public void displayPatientInfo(){};
    public void confirmAppointment(){};
    public void reschedule(){};



}
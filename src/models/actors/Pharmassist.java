package models.actors;

import abstract_factory.factories.abstractions.IAdministrationStaff;
import models.data.Prescription;

import java.util.List;

public class Pharmassist extends Staff implements IAdministrationStaff {
    private String name = "Pharmassist";
    private String Post = "post";
    private List<Prescription> prescriptionList;

    @Override
    public String toString() {
        return "Pharmassist{" +
                "name='" + name + '\'' +
                ", Post='" + Post + '\'' +
                ", prescriptionList=" + prescriptionList +
                '}';
    }

    public void showPrescription(){};
    public void displayPatientBill(){};
    public void manageMedicines(){};
}

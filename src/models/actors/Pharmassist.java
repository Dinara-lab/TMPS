package models.actors;

import factories.abstractions.IAdministrationStaff;

public class Pharmassist extends Staff implements IAdministrationStaff {
    private String name = "Pharmassist";
    private String Post = "post";


    @Override
    public String toString() {
        return "Pharmassist{" +
                "name='" + name + '\'' +
                ", Post='" + Post + '\'' +
                '}';
    }

    public void showPrescription(){};
    public void displayPatientBill(){};
    public void manageMedicines(){};
}

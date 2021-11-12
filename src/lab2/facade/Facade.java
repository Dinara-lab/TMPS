package lab2.facade;

import models.actors.Patient;
import models.actors.UnregisteredVisitor;

public class Facade {
    public static void getPersonalInformation(String person){

        switch (person){
            case "Patient" :
                Patient.register();
                Patient.getMedicalRecord();
                break;
            case "UnregisteredVisitor" :
                UnregisteredVisitor.register();
                UnregisteredVisitor.getMedicalRecord();
                break;
        }

    }
}

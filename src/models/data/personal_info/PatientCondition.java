package models.data.personal_info;

import models.data.medical_states.*;
import models.data.abstractions.PatientState;

public class PatientCondition {

    PatientState undetermined;
    PatientState good;
    PatientState fair;
    PatientState serious;
    PatientState critical;

    PatientState patientState;

    public PatientCondition(){
        undetermined = new Undetermined(this);
        good = new Good(this);
        fair = new Fair(this);
        serious = new Serious(this);
        critical = new Critical(this);
        patientState = undetermined;
    }

    public  void setPatientState( PatientState newPatientState){
        patientState = newPatientState;
    }
    public void handle(){
        patientState.handle();
    }

}

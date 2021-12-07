package models.data.medical_states;

import models.data.personal_info.PatientCondition;
import models.data.abstractions.PatientState;

public class Undetermined implements PatientState {

    PatientCondition patientCondition;

    public Undetermined(PatientCondition newPatientCondition){
     patientCondition = newPatientCondition;
    }

    @Override
    public void handle() {
        System.out.println("The state is undetermined, the medical report should be checked !");
    }
}

package models.data.medical_states;

import models.data.personal_info.PatientCondition;
import models.data.abstractions.PatientState;

public class Good implements PatientState {

    PatientCondition patientCondition;

    public Good(PatientCondition newPatientCondition){
        patientCondition = newPatientCondition;
    }

    @Override
    public void handle() {
        System.out.println("The state is good, the patient " +
                "should be checked one more time after 1 month");

    }
}

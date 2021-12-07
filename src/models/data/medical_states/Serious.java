package models.data.medical_states;

import models.data.personal_info.PatientCondition;
import models.data.abstractions.PatientState;

public class Serious implements PatientState {
    PatientCondition patientCondition;

    public Serious(PatientCondition newPatientCondition){
        patientCondition= newPatientCondition;
    }
    @Override
    public void handle() {
        System.out.println("Vital signs may be unstable and not within normal limits. " +
                "Patient is seriously ill. Indicators are questionable.");
    }
}

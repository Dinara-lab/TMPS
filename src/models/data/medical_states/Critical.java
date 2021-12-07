package models.data.medical_states;

import models.data.personal_info.PatientCondition;
import models.data.abstractions.PatientState;

public class Critical implements PatientState {
   PatientCondition patientCondition;

    public Critical(PatientCondition newPatientCondition){
        patientCondition = newPatientCondition;

    }
    @Override
    public void handle() {
        System.out.println("Vital signs are unstable and not within normal limits. " +
                "Patient may be unconscious. Indicators are unfavorable.");
    }
}

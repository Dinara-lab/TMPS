package models.data.medical_states;

import models.data.personal_info.PatientCondition;
import models.data.abstractions.PatientState;

public class Fair implements PatientState {

    PatientCondition patientCondition;

    public Fair(PatientCondition newPatientCondition){
        patientCondition = newPatientCondition;
    }

    @Override
    public void handle() {
        System.out.println("Vital signs are stable and within normal limits. " +
                "Patient is conscious, but may be uncomfortable. Indicators are favorable.");
    }
}

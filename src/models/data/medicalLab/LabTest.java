package models.data.medicalLab;

import lab2.decorator.PatientMedicalRecord;
import models.data.Diagnose;

public class LabTest extends Diagnose {

    public LabTest(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    public void testPerform(){};
    public void viewTestDetails(){};
    public void viewTestResult(){};

}



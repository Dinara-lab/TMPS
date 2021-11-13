package models.data.personal_info;

import models.data.medical_records.MedicalRecord;
import models.data.medical_records.abstractions.PatientMedicalRecord;

public class Diagnose extends MedicalRecord {

    private String type;

    public Diagnose(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    public void viewDiagnoseDetails(){};

    @Override
    public void record() {
        super.record();
        System.out.println("Adding Patient Diagnose");
    }
}

package models.data.personal_info;

import models.data.medical_records.MedicalRecord;
import models.data.medical_records.abstractions.PatientMedicalRecord;

public class Medications extends MedicalRecord {

    public Medications(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public void record() {
        super.record();
        System.out.println("Adding Patient Medications");
    }
}

package models.data.medical_records;

import models.data.medical_records.abstractions.PatientMedicalRecord;

public class BasicMedicalRecord implements PatientMedicalRecord {
    PatientTreatmentPlan treatmentPlan;
    @Override
    public void record() {
        System.out.println("Basic Medical Record");
    }
}

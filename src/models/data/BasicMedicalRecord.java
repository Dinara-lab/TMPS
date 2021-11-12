package models.data;

import lab2.decorator.PatientMedicalRecord;

public class BasicMedicalRecord implements PatientMedicalRecord {
    PatientTreatmentPlan treatmentPlan;
    @Override
    public void record() {
        System.out.println("Basic Medical Record");
    }
}

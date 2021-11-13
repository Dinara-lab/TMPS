package models.data.medical_records;

import models.data.medical_records.abstractions.PatientMedicalRecord;

public class PatientDemographics extends MedicalRecord {

    public PatientDemographics(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public void record() {
        super.record();
        System.out.println("Adding Patient Demographics");
    }
}

package models.data.medical_records;

import models.data.medical_records.abstractions.PatientMedicalRecord;

public class MedicalRecord implements PatientMedicalRecord {
    protected PatientMedicalRecord patientMedicalRecord;

    public MedicalRecord(PatientMedicalRecord patientMedicalRecord){
        this.patientMedicalRecord = patientMedicalRecord;
    }

    @Override
    public void record() {
        this.patientMedicalRecord.record();
    }
}

package models.data.medical_records;

import models.data.medical_records.abstractions.PatientMedicalRecord;

import java.util.Date;

public class PatientHealthProblems extends MedicalRecord {

    String description;
    Date recordedDate;

    public PatientHealthProblems(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public void record() {
        super.record();
        System.out.println("Adding Patient Health Problems");
    }
}

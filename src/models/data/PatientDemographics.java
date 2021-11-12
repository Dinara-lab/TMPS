package models.data;

import lab2.decorator.MedicalRecord;
import lab2.decorator.PatientMedicalRecord;

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

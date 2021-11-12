package models.data;

import lab2.decorator.MedicalRecord;
import lab2.decorator.PatientMedicalRecord;

public class Medications extends MedicalRecord {

    private String name;
    private int dosage;
    public void consult(){};

    public Medications(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public void record() {
        super.record();
        System.out.println("Adding Patient Medications");
    }
}

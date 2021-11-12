package models.data;

import lab2.decorator.MRecordDecorator;
import lab2.decorator.PatientMedicalRecord;

public class Medications extends MRecordDecorator {

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

package models.data;

import lab2.decorator.MRecordDecorator;
import lab2.decorator.PatientMedicalRecord;

public class Diagnose extends MRecordDecorator {

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

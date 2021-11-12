package models.data;

import lab2.decorator.MRecordDecorator;
import lab2.decorator.PatientMedicalRecord;

import java.util.Date;

public class PatientHealthProblems extends MRecordDecorator {

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

package models.data.medicalLab;


import lab2.decorator.PatientMedicalRecord;

public class HemoglobinA1C extends LabTest {
    String name = "HemoglobinA1C";

    public HemoglobinA1C(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public String toString() {
        return "HemoglobinA1C{" +
                "name='" + name + '\'' +
                '}';
    }
}

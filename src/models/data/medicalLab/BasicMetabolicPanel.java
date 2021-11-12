package models.data.medicalLab;

import lab2.decorator.PatientMedicalRecord;

public class BasicMetabolicPanel extends LabTest  {
    String name = "Basic Metabolic Panel";

    public BasicMetabolicPanel(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public String toString() {
        return "BasicMetabolicPanel{" +
                "name='" + name + '\'' +
                '}';
    }
}

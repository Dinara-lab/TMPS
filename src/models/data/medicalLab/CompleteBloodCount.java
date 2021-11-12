package models.data.medicalLab;


import lab2.decorator.PatientMedicalRecord;

public class CompleteBloodCount extends LabTest  {
    String name = "Complete Blood Count";

    public CompleteBloodCount(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}


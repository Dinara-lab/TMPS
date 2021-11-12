package models.data.medicalLab;


import lab2.decorator.PatientMedicalRecord;

public class ProthrombinTime extends LabTest  {
    String name = "ProthrombinTime";

    public ProthrombinTime(PatientMedicalRecord patientMedicalRecord) {
        super(patientMedicalRecord);
    }

    @Override
    public String toString() {
        return "ProthrombinTime{" +
                "name='" + name + '\'' +
                '}';
    }
}
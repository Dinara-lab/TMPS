package lab2.decorator;

public class MedicalRecord implements PatientMedicalRecord {
    protected PatientMedicalRecord patientMedicalRecord;

    public MedicalRecord(PatientMedicalRecord patientMedicalRecord){
        this.patientMedicalRecord = patientMedicalRecord;
    }

    @Override
    public void record() {
        this.patientMedicalRecord.record();
    }
}

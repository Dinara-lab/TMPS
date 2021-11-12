package lab2.decorator;

public class MRecordDecorator implements PatientMedicalRecord {
    protected PatientMedicalRecord patientMedicalRecord;

    public MRecordDecorator(PatientMedicalRecord patientMedicalRecord){
        this.patientMedicalRecord = patientMedicalRecord;
    }

    @Override
    public void record() {
        this.patientMedicalRecord.record();
    }
}

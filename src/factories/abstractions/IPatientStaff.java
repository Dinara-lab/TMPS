package factories.abstractions;

import models.data.medicalLab.LabTestWork;
import models.data.medical_records.abstractions.PatientMedicalRecord;
import models.actors.Patient;
import models.actors.UnregisteredVisitor;
import models.data.personal_info.PatientCondition;

public interface IPatientStaff {

    void setMedicalRecord(PatientMedicalRecord patientMedicalRecord);
    void makeAppointment();

    void setLabTest(LabTestWork labTestWork);

    default void getPersonalInformation(String person){

        switch (person){
            case "Patient" :
                Patient.register();
                Patient.getInformation(new Patient());
                break;
            case "UnregisteredVisitor" :
                UnregisteredVisitor.register();
                UnregisteredVisitor.getInformation(new UnregisteredVisitor());
                break;
        }

    }


    default void setHealthState(PatientCondition patientCondition){
        Patient.setMedicalState(patientCondition);
        System.out.println("MedicalState was set to the patient");
    }
}

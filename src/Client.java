import factories.FactoryCreator;
import factories.abstractions.IFactory;
import factories.abstractions.IPatientStaff;
import models.data.medicalLab.MedicalLab;
import models.data.medicalLab.LabTestWork;
import models.data.abstractions.Material;
import models.data.medical_records.abstractions.PatientMedicalRecord;
import models.data.medical_records.BasicMedicalRecord;
import models.data.personal_info.Medications;
import models.data.medical_records.PatientDemographics;
import models.data.medicalLab.LaboratoryTest;


public class Client {

    public static void main(String[] args) {

        // Abstract Factory Pattern
        IFactory patientFactory = (IFactory) FactoryCreator.createFactory("Patient");
        IPatientStaff patient = (IPatientStaff) patientFactory.createObject("Patient");
        IPatientStaff visitor = (IPatientStaff) patientFactory.createObject("UnregisteredVisitor");


        // Adapter Pattern
        Material m =  new MedicalLab();
        LabTestWork basicMetabolicPanel = new LabTestWork();
        basicMetabolicPanel.setMaterial(m);
        basicMetabolicPanel.setType(LaboratoryTest.BASICMETABOLICPANEL);
        basicMetabolicPanel.performLaboratoryWork();
        System.out.println();


        //Decorator Pattern
        PatientMedicalRecord patientDemographics = new PatientDemographics(new BasicMedicalRecord());
        patientDemographics.record();
        patient.setMedicalRecord(patientDemographics);
        patient.setLabTest(basicMetabolicPanel);

        //Detailed Medical Record
        PatientMedicalRecord patientDemographicsAndMedications = new PatientDemographics(new Medications(new BasicMedicalRecord()));
        patientDemographicsAndMedications.record();
        patient.setMedicalRecord(patientDemographicsAndMedications);


        //Facade pattern
        patient.getPersonalInformation("Patient");
        visitor.getPersonalInformation("UnregisteredVisitor");
        patient.makeAppointment();
        visitor.makeAppointment();

    }
}

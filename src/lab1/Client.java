package lab1;
import lab1.factories.FactoryCreator;
import lab1.factories.abstractions.IAdministrationStaff;
import lab1.factories.abstractions.IFactory;
import lab1.factories.abstractions.IMedicineStaff;
import lab1.factories.abstractions.IPatientStaff;
import lab2.adapter.MedicalLab;
import lab2.adapter.LabTestWork;
import lab2.adapter.Material;
import lab2.decorator.PatientMedicalRecord;
import lab2.facade.PersonInformation;
import models.data.BasicMedicalRecord;
import models.data.Diagnose;
import models.data.Medications;
import models.data.PatientDemographics;


public class Client {

    public static void main(String[] args) {


        // Abstract Factory Pattern
        IFactory doctorFactory = (IFactory) FactoryCreator.createFactory("Doctor");
        IFactory administrationFactory = (IFactory) FactoryCreator.createFactory("Admin");
        IFactory patientFactory = (IFactory) FactoryCreator.createFactory("Patient");

        IMedicineStaff doctor = (IMedicineStaff) doctorFactory.createObject("Doctor");
        IAdministrationStaff admin = (IAdministrationStaff) administrationFactory.createObject("Admin");
        IPatientStaff patient = (IPatientStaff) patientFactory.createObject("Patient");

        System.out.println(doctor);
        System.out.println(admin);
        System.out.println(patient);


        // Adapter Pattern
        System.out.println();
        System.out.println("Adapter pattern");
        Material m =  new MedicalLab();
        LabTestWork labTestWork = new LabTestWork();
        labTestWork.setMaterial(m);
        labTestWork.performLaboratoryWork();
        System.out.println();


        //Decorator Pattern
        System.out.println("Decorator pattern");
        PatientMedicalRecord patientDemographics = new PatientDemographics(new BasicMedicalRecord());
        patientDemographics.record();

        PatientMedicalRecord patientDiagnose = new Diagnose(new BasicMedicalRecord());
        patientDiagnose.record();

        PatientMedicalRecord patientMedications = new Medications(new BasicMedicalRecord());
        patientMedications.record();

        System.out.println();
        System.out.println("patientDemographicsAndMedications");
        PatientMedicalRecord patientDemographicsAndMedications = new PatientDemographics(new Medications(new BasicMedicalRecord()));
        patientDemographicsAndMedications.record();

        System.out.println();
        System.out.println("patientDiagnoseAndMedications");
        PatientMedicalRecord patientDiagnoseAndMedications = new Diagnose(new Medications(new BasicMedicalRecord()));
        patientDiagnoseAndMedications.record();


        //Facade pattern
        System.out.println();
        System.out.println("Facade pattern");
        PersonInformation.getPersonalInformation("Patient");
        PersonInformation.getPersonalInformation("UnregisteredVisitor");


    }
}

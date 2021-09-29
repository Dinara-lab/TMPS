package abstract_factory;
import abstract_factory.factories.FactoryCreator;
import abstract_factory.factories.abstractions.*;


public class AbstractFactoryClient {

    public static void main(String[] args) {
        IFactory doctorFactory = (IFactory) FactoryCreator.createFactory("Doctor");
        IFactory administrationFactory = (IFactory) FactoryCreator.createFactory("Admin");
        IFactory patientFactory = (IFactory) FactoryCreator.createFactory("Patient");

        IMedicineStaff doctor = (IMedicineStaff) doctorFactory.createObject("Doctor");
        IAdministrationStaff admin = (IAdministrationStaff) administrationFactory.createObject("Admin");
        IPatientStaff patient = (IPatientStaff) patientFactory.createObject("Patient");

        System.out.println(doctor);
        System.out.println(admin);
        System.out.println(patient);


    }
}

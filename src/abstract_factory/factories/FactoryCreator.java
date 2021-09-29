package abstract_factory.factories;


import abstract_factory.factories.AdministrationFactory;
import abstract_factory.factories.MedicineFactory;
import abstract_factory.factories.PatientFactory;

public class FactoryCreator {
    public static Object createFactory(String type){
        switch (type){
            case "Doctor": return new MedicineFactory();
            case "Patient": return new PatientFactory();
            case "Admin": return  new AdministrationFactory();
            default:return null;
        }
    }
}


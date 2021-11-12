package lab1.factories;

import lab1.factories.abstractions.IFactory;
import models.actors.Patient;
import models.actors.UnregisteredVisitor;

public class PatientFactory implements IFactory {

    private static PatientFactory patientFactoryInstance = null;
    public PatientFactory(){};
    public static PatientFactory getInstance(){
        if(patientFactoryInstance==null){
            synchronized (MedicineFactory.class){
                if(patientFactoryInstance == null){
                    patientFactoryInstance = new PatientFactory();
                }
            }
        }
        return patientFactoryInstance;
    }

    @Override
    public Object createObject(String type) {
        switch (type){
            case "Patient": return new Patient();
            case "UnregisteredVisitor": return new UnregisteredVisitor();
            default:return null;
        }
    }
}


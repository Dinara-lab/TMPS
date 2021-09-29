package abstract_factory.factories;

import abstract_factory.factories.abstractions.IMedicineStaff;
import abstract_factory.factories.abstractions.IFactory;
import models.actors.Doctor;
import models.actors.LabAssistant;
import models.data.Phone;


public class MedicineFactory implements IFactory {
    private static MedicineFactory medicineFactoryInstance = null;
    public MedicineFactory(){}

    public static MedicineFactory getInstance(){
        if(medicineFactoryInstance==null){
            synchronized (MedicineFactory.class){
                if(medicineFactoryInstance == null){
                    medicineFactoryInstance = new MedicineFactory();
                }
            }
        }
        return medicineFactoryInstance;
    }

    @Override
    public IMedicineStaff createObject(String type) {
        switch (type){

            case "Doctor": return new Doctor();
            case "LabAssistant": return new LabAssistant();
            default:return null;
        }
    }
}


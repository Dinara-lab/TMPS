package factory_method;
import abstract_factory.factories.MedicineFactory;
import factory_method.abstractions.ICreator;
import factory_method.abstractions.IProduct;
import models.data.medicalLab.BasicMetabolicPanel;
import models.data.medicalLab.HemoglobinA1C;
import models.data.medicalLab.ProthrombinTime;
import models.data.medicalLab.CompleteBloodCount;


public class CreatorImpl implements ICreator {

    private static CreatorImpl creatorImplInstance = null;
    private CreatorImpl(){};

    public static CreatorImpl getInstance(){
        if(creatorImplInstance==null){
            synchronized (MedicineFactory.class){
                if(creatorImplInstance == null){
                    creatorImplInstance = new CreatorImpl();
                }
            }
        }
        return creatorImplInstance;
    }

    @Override
    public IProduct factoryMethod(String type) {

        switch (type){
            case "Type 1": return new CompleteBloodCount();
            case "Type 2": return new ProthrombinTime();
            case "Type 3": return new BasicMetabolicPanel();
            case "Type 4": return new HemoglobinA1C();
            default: return null;
        }
    }
}

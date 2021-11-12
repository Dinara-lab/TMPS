package lab1.factories;
import lab1.factories.abstractions.IFactory;
import models.actors.Admin;
import models.actors.Pharmassist;
import models.actors.Receptionist;

public class AdministrationFactory implements IFactory {
    private static AdministrationFactory administrationFactoryInstance = null;
    public AdministrationFactory(){};

    public static AdministrationFactory getInstance(){
        if(administrationFactoryInstance==null){
            synchronized (MedicineFactory.class){
                if(administrationFactoryInstance == null){
                    administrationFactoryInstance = new AdministrationFactory();
                }
            }
        }
        return administrationFactoryInstance;
    }

    @Override
    public Object createObject(String type) {

        switch (type){
            case "Receptionist": return new Receptionist();
            case "Pharmassist" : return  new Pharmassist();
            case "Admin" : return new Admin();
            default:return null;
        }
    }
}
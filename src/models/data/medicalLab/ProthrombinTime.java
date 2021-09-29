package models.data.medicalLab;

import factory_method.abstractions.IProduct;

public class ProthrombinTime extends LabTest implements IProduct {
    String name = "ProthrombinTime";

    @Override
    public String toString() {
        return "ProthrombinTime{" +
                "name='" + name + '\'' +
                '}';
    }
}
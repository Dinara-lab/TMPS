package models.data.medicalLab;

import factory_method.abstractions.IProduct;

public class CompleteBloodCount extends LabTest implements IProduct {
    String name = "Complete Blood Count";

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}


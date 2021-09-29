package models.data.medicalLab;

import factory_method.abstractions.IProduct;

public class BasicMetabolicPanel extends LabTest implements IProduct {
    String name = "Basic Metabolic Panel";

    @Override
    public String toString() {
        return "BasicMetabolicPanel{" +
                "name='" + name + '\'' +
                '}';
    }
}

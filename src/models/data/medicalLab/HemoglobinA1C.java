package models.data.medicalLab;

import factory_method.abstractions.IProduct;

public class HemoglobinA1C extends LabTest implements IProduct {
    String name = "HemoglobinA1C";

    @Override
    public String toString() {
        return "HemoglobinA1C{" +
                "name='" + name + '\'' +
                '}';
    }
}

package models.data.medicalLab;

import models.data.abstractions.Material;

public class LabTestWork {
    private Material material;
    private Object type;

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public void performLaboratoryWork(){
        material.process();
        System.out.println("test is performed");
    }
}

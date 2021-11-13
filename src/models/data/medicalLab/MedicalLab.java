package models.data.medicalLab;

import models.data.abstractions.Material;

public class MedicalLab implements Material {
    TechnicalMaterial technicalMaterial = new TechnicalMaterial();
    @Override
    public void process() {
        technicalMaterial.performTheAnalysis();
    }
}

package lab2.adapter;

public class LabAdapter implements Material {
    TechnicalMaterial technicalMaterial = new TechnicalMaterial();
    @Override
    public void process() {
        technicalMaterial.performTheAnalysis();
    }
}

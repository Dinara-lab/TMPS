package lab2.adapter;

public class LabTestWork {
    private Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }
    public void performLaboratoryWork(){
        material.process();
        System.out.println("test is performed");
    }
}

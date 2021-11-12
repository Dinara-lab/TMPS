package models.actors;

import lab1.factories.abstractions.IMedicineStaff;
import models.data.medicalLab.LabTest;

import java.util.List;

public class LabAssistant extends Staff implements IMedicineStaff {
    private String name = "LabAssistant";
    private String Post;
    private List<LabTest> labTests;

    @Override
    public String toString() {
        return "LabAssistant{" +
                "name='" + name + '\'' +
                ", Post='" + Post + '\'' +
                ", labTests=" + labTests +
                '}';
    }

    public void collectSamples(){};
    public void generateReport(){};
    public void showTestResult(){};
    public void displayPatientBill(){};
}


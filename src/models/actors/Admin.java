package models.actors;

import abstract_factory.factories.abstractions.IAdministrationStaff;

public class Admin extends AdministrativeStaff implements IAdministrationStaff {
    private String name = "Admin";
    private String add = "add";
    private String post= "post";

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public void displayReceptionistInfo(){};
}

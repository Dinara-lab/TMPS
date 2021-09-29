package models.structures;
import models.data.Phone;
import models.actors.Person;


import java.util.List;
import java.util.Set;

public class Hospital {
    public String name;
    public String address;
    public Phone phone;

    private Set<Person> persons;
    private final List<Department> departmentList;

    public Hospital(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
    public void displayDetails(){};
}

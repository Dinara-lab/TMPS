package models.data;

public class Phone {

    private  String workPhoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.workPhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }

    private Phone(){}

    public static Phone phoneClone(){
        Phone phone = new Phone();
        String newPhoneNumber = "078957643";
        phone.setPhoneNumber(newPhoneNumber);
        return phone;
    }


}



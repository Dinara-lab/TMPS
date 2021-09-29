package models.data;

public class Phone {

    private static String phoneNumber = null;
    private Phone(){}
    public void setPhoneNumber(String phoneNumber) {
        Phone.phoneNumber = phoneNumber;
    }

    public Phone phoneClone(){
        Phone phone = new Phone();
        String newPhoneNumber = new String();
        phone.setPhoneNumber(newPhoneNumber);
        return phone;
    }

}


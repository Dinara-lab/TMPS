package models.data.personal_info;

public class Email {

    private String email = null;
    private Email(){};

    public void setEmail(String email) {
        this.email = email;
    }

    public Email emailClone(){
        Email email = new Email();
        String newEmail = new String();
        email.setEmail(newEmail);
        return email;
    }
}

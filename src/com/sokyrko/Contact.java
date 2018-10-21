package com.sokyrko;

public class Contact {

    public String phone;
    private String email;

    private Validator phoneValidator;
    private Validator emailValidator;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        if (phoneValidator.validate(phone)) {
            this.phone = phone;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (emailValidator.validate(email)) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", phoneValidator=" + phoneValidator +
                ", emailValidator=" + emailValidator +
                '}';
    }
}

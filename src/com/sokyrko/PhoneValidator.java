package com.sokyrko;

public class PhoneValidator extends Contact implements Validator <String>{

    public PhoneValidator() {
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    @Override
    public boolean validate(String input) {

       if(phone.matches("[0-9]+") && phone.startsWith("+380")){
           return true;
       }
        return false;
    }
}

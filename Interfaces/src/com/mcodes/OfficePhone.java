package com.mcodes;

public class OfficePhone implements ITelephone {
    private String myNumber;
    private boolean isRinging;

    public OfficePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Always on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Ringing " + phoneNumber + " on office phone");
    }

    @Override
    public void answer() {
        System.out.println("Answering office phone");
    }

    @Override
    public boolean ring(String phoneNumber) {
        if (phoneNumber.equals(myNumber)) {
            isRinging = true;
            System.out.println("Office phone ringing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

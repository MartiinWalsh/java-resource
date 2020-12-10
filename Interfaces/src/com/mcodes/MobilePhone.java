package com.mcodes;

public class MobilePhone implements ITelephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        if (isOn) {

            System.out.println("Ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is off");
        }
    }

    @Override
    public void answer() {
        System.out.println("Answering mobile phone");
    }

    @Override
    public boolean ring(String phoneNumber) {
        if (phoneNumber.equals(myNumber) && isOn) {
            isRinging = true;
            System.out.println("Mobile phone ringing");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is off or wrong number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

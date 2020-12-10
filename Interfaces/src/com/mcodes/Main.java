package com.mcodes;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;

        myPhone = new OfficePhone("045234543");
        myPhone.powerOn();
        myPhone.ring("0831234567");
        myPhone.answer();
        System.out.println();

        myPhone = new MobilePhone("0851234567");
        myPhone.powerOn();
        myPhone.ring("131324");
        myPhone.ring("0851234567");
        myPhone.answer();
    }
}

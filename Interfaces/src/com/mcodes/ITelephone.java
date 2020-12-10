package com.mcodes;

public interface ITelephone {
    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean ring(String phoneNumber);
    boolean isRinging();
}

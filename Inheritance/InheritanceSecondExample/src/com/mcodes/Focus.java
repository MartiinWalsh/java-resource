package com.mcodes;

public class Focus extends Car{
    private int breakdownCoverMonths;

    public Focus(int breakdownCoverMonths) {
        super("Focus", "4WD", 4, 5, 6, false);
        this.breakdownCoverMonths = breakdownCoverMonths;
    }

    //Rate: difference in speed from the current speed
    public void accelerate(int rate){
        //Automatic gear change as car type is'nt manual
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0 ){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <=10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <=30){
            changeGear(3);
        } else if(newVelocity > 30 && newVelocity <=40){
            changeGear(4);
        } else if(newVelocity > 40 && newVelocity <=50){
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}

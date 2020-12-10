package com.mcodes;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("Scope check, publicVar = " + publicVar + " / varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo = 2;

        for(int i = 0; i < 10; i++){
            System.out.println(i + " times two = " + i * varTwo);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree form outer class: " + innerClass.varThree);
    }

    public class InnerClass{
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne +" and varThree is " + varThree);
        }

        public void timesTwo(){
            System.out.println("varOne can still be accessed here, " + varOne);
            for(int i = 0; i < 10; i++){
                System.out.println(i + " times two = " + i * varThree);
            }
        }


    }
}

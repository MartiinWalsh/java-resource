package com.mcodes;

public class Main {
    public static void main(String[] args) {
        String varFour = "This variable is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        System.out.println("scopeInstance varOne = " + scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();

        System.out.println("---------");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();


    }
}

package com.mcodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AndOrNot {
    public static void main(String[] args) {

        String tvTest = "tstvtkt";
        String tNotVRegEx = "t[^v]"; // This method wont catch the last t as it must have another character after it
        String tNotVRegExNot = "t(?!v)"; // ? is part of the look ahead syntax, the ! doesnt consume a character, therefore catching the last t
        Pattern tNotVPattern = Pattern.compile(tNotVRegExNot);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        int count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        // t(?=v) Find matches of v followed by t, but don't include v in match

        //Visa Card Example

        // ^4[0-9]{12}([0-9]{3})?$
        // Card number should start with 4, then 12 numbers. Ending in optional 3 numbers
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
}

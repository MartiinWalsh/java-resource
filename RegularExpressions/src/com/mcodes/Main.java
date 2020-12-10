package com.mcodes;

public class Main {
    public static void main(String[] args) {
        String string = "This is a string. Yes, this is.";
        System.out.println(string);
        String yourString = string.replaceAll("This", "New");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF32Ghhhiiiiskdj55z";
        // . is a wildcard for any character
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        // ^ boundary match: Replace at the start of string
        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY"));

        // Both return false as the whole string must match, not just a subsection
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDee"));
        //Returns true
        System.out.println(alphanumeric.matches(alphanumeric));

        // $ boundary match: Replace at the end of string
        System.out.println(alphanumeric.replaceAll("j55z$", "The end"));


        // [ ] Match specific letter or set of letters
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));

        // Replace letters followed by specific sequence
        // If any of the first set of letter are followed by any of the second set
        System.out.println(alphanumeric.replaceAll("[aei][Fs]", "X"));

        // Replace either upper or lower case
        System.out.println("Harry".replaceAll("[hH]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF32Ghhhiiiiskdj55z";
        // Replace everything except e and j
        // ^ inside square brackets will match all characters that are not in the brackets
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));

        // Specifying a range of characters
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        // (?i) Remove case sensitivity. Add u for unicode string (?iu)
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f]", "X"));

        // Replace all numbers
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        // Replace all non digits
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));


        // Remove all whitespace
        String hasWhitespace = "I have whitespace and\ta tab, and a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s",""));
        System.out.println(hasWhitespace.replaceAll("\t",  "X"));
        // Remove non whitespace characters, tab spaces and newline remain
        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        //matches a-z A-Z 0-9 _
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));

        // Matches word boundaries
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));
        System.out.println(hasWhitespace.replaceAll("\\B", "X"));




    }
}

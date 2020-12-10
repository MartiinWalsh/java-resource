package com.mcodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersAndPatternMatcherClasses {
    public static void main(String[] args) {
        String alphanumeric = "abcDeeeF32Ghhhiiiijskdj55z";
        // {3} the number of the proceeding character that must occur for match
        System.out.println(alphanumeric.replaceAll("^abcDe{3}", "YYY"));
        // + Specifying one or more of a character
        System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY"));
        // * Followed by 0 or more of a character
        System.out.println(alphanumeric.replaceAll("^abcDe*", "YYY"));
        //Minimum and maximum times a char can occur
        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        // Replace all occurrences of h, followed by any number of i, followed by at least one j
        System.out.println(alphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        // ( ) capture group
        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset(); //Reset the internal state so matcher can be used again
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPatten = "(<h2>.*?</h2>)";
        Pattern groupPatter = Pattern.compile(h2GroupPatten);
        Matcher groupMatcher = groupPatter.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups =  "(<h2>)(.+?)(</h2>)";
        Pattern groupTextPattern = Pattern.compile(h2TextGroups);
        Matcher groupTextMatcher = groupTextPattern.matcher(htmlText);
        System.out.println(groupTextMatcher.matches());
        groupMatcher.reset();

        while(groupTextMatcher.find()){
            System.out.println("Occurrence: " + groupTextMatcher.group(2));
        }

    }
}

package org.launchcode.java;


import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String mainString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newString = mainString.split("\\.");

        for (String a : newString)
            System.out.println(a);
        //System.out.println(Arrays.toString(newString));
    }
}

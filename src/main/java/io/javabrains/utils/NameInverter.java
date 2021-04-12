package io.javabrains.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class NameInverter {
    public String invert(String name) {
        /*if (name == null) {
            throw new NullPointerException();
        }*/
       //String[] nameArray =name.trim().split(" ");
        ArrayList<String> nameArray = new ArrayList<String>(Arrays.asList(name.trim().split(RegularExpressions.anyAmountOfWhiteSpace())));
        if(nameArray.size()<2){
            return nameArray.get(0);
        }
        return invert(nameArray);
    }

    private String invert(ArrayList<String> nameArray) {
        String first= nameArray.get(0);
        String last= nameArray.get(1);
        return String.format("%s,%s",last,first);
    }
}

class RegularExpressions{
    public static String anyAmountOfWhiteSpace(){
        return "\\s+";
    }
}
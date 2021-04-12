package io.javabrains.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        return invert(withoutHonarific(nameArray));
    }

    private ArrayList<String> withoutHonarific(ArrayList<String> nameArray) {
        if(isHonorific(nameArray.get(0))) {
            nameArray.remove(0);

        }
        return nameArray;

    }

    private boolean isHonorific(String s) {
        List<String> immutableList =
                List.of("Mr","Mrs","Dr");
        if(immutableList.contains(s)){
            return true;

        }
        else{
            return false;
        }
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
package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.HashMap;
public class lsn2studio {
    public static void main(String[] args) {
        String string = ("If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.");
        char[] charString = string.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < charString.length; i++) {
            if (charMap.containsKey(charString[i])) {
              charMap.put(charString[i], charMap.get(charString[i])+1);
            } else {
                charMap.put(charString[i], 1);
            }
            System.out.println(charMap);


        }
    }
}

package com.StringHandling;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "Javaa";
        System.out.println(removeDuplicates(s));
    }
    static String removeDuplicates(String s) {
        String str = new String();
        int len = s.length();
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(str.indexOf(c) < 0){
                str += c;
            }
        }
        return str;
    }
}

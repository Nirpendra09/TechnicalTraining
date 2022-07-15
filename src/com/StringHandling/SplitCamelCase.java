package com.StringHandling;

import java.util.*;

public class SplitCamelCase {
    public static void main(String[] args) {
        String str = "HELLOBroken";
        System.out.println(splitCamelCaseString(str));
    }

    public static LinkedList<String> splitCamelCaseString(String s){
        LinkedList<String> result = new LinkedList<String>();
        for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            result.add(w);
        }
        return result;
    }
}

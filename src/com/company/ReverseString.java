package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Ram";
        char[] ch = s.toCharArray();

        int i = 0;
        int j = ch.length-1;
        while(i <= j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String res = "";
        for(char c : ch) {
            res += c;
        }
        System.out.println("Res -> " +res);
    }
}

package com.StringHandling;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Example";
        String[] words = str.split(" ");
        StringBuilder reverse = new StringBuilder();

        for (String word : words) {
            String s = reverse(word);
            reverse.append(s).append(" ");
        }
        System.out.println(reverse);
    }

    static String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}

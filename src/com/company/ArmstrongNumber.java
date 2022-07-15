package com.company;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 371;
        int sum = 0;

        int temp = n;
        while(temp != 0) {
            int rem = temp%10;
            sum += (int)Math.pow(rem, 3);
            temp /= 10;
        }
        System.out.println("Is Armstrong Number -> " + ( n == sum));
    }
}

package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {

//        BigDecimal a = new BigDecimal("0.03");
//        BigDecimal b = new BigDecimal("0.04");
//        BigDecimal c = b.subtract(a);
//
        BigInteger a = new BigInteger("97543367645");
        BigInteger b = new BigInteger("87543367645");
        BigInteger c = a.add(b);

        System.out.println("result -> "+ c);
    }
}

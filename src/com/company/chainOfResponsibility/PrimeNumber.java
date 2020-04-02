package com.company.chainOfResponsibility;

import java.math.BigInteger;

public class PrimeNumber extends ABaseHandler {
    @Override
    public void handle(int value) {
        boolean probablePrime = BigInteger.valueOf(value).isProbablePrime((int) Math.log(value));
        if (probablePrime) {
            System.out.println(value + " - простое число.");
        }
    }
}

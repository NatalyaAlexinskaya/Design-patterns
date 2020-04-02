package com.company.chainOfResponsibility;

public class DivisionNumber extends ABaseHandler {
    @Override
    public void handle(int value) {
        if (value % 3 == 0) {
            System.out.println(value + " - делится без остатка на 3.");
        }
    }
}

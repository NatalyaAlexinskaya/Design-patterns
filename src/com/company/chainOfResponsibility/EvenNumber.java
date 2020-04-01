package com.company.chainOfResponsibility;

public class EvenNumber extends ABaseHandler {
    @Override
    public void handle(int value) {
        if (value % 2 == 0) {
            System.out.println(value + " - четное число.");
        }
    }
}

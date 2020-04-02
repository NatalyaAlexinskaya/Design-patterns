package com.company.chainOfResponsibility;

public class Request {
    public static void main(String[] args) {
        int[] numbers = {11, 13, 23, 45, 48, 22, 76, 33, 20, 67};

        for (int i: numbers) {
            ABaseHandler handler = new PrimeNumber();
            EvenNumber evenNumber = new EvenNumber();
            handler.setNext(evenNumber);
            evenNumber.setNext(new DivisionNumber());
            handler.validate(i);
        }
    }
}

package com.company.builder;

public class Main {
    public static void main(String[] args) {
        Letter letter1 = new Letter.Builder()
                .setRecepients(new ARecepient("Nata", "nata@mail.ru"))
                .setSender(new ARecepient("Piter", "piter@mail.com"))
                .build();
        System.out.println(letter1.toString());
        System.out.println();

        Letter letter2 = new Letter.Builder()
                .setRecepients(new ARecepient("Kirill", "kirill@mail.ru"), new ARecepient("Roman", "roman@mail.ru"))
                .setSender(new ARecepient("Anton", "anton@mail.ru"))
                .setSubject("Приветствие")
                .setBody("Привет!")
                .build();
        System.out.println(letter2.toString());
    }
}

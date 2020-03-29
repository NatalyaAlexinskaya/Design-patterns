package com.company.builder;

public class Main {
    public static void main(String[] args) {
        Letter letter1 = new AEmailMessage()
                .create(new ARecepient("Piter", "piter@mail.com"), new ARecepient("Nata", "nata@mail.ru"))
                .send();
        System.out.println(letter1.toString());
        System.out.println();
        Letter letter2 = new AEmailMessage()
                .create(new ARecepient("Anton", "anton@mail.ru"), new ARecepient("Kirill", "kirill@mail.ru"), new ARecepient("Roman", "roman@mail.ru"))
                .setSubject("Приветствие")
                .setBody("Привет!").send();
        System.out.println(letter2.toString());
    }
}

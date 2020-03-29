package com.company.builder;

import java.util.List;

public class Letter {
    private List<ARecepient> recepients; // получатели
    private ARecepient sender; // отправитель
    private String subject; // тема письма
    private String body; // текст письма

    public void setRecepients(List<ARecepient> recepients) {
        this.recepients = recepients;
    }

    public void setSender(ARecepient sender) {
        this.sender = sender;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        String string = "";

        if (body == null && subject == null) {
            string = "Кому: " + recepients + "\n" +
                    "От кого: " + sender + "\n" +
                    "Тема: Без темы" + "\n" +
                    "Текст письма: ";
        } else if (body == null) {
            string = "Кому: " + recepients + "\n" +
                    "От кого: " + sender + "\n" +
                    "Тема: " + subject + "\n" +
                    "Текст письма: ";
        } else if (subject == null) {
            string = "Кому: " + recepients + "\n" +
                    "От кого: " + sender + "\n" +
                    "Тема: Без темы" + "\n" +
                    "Текст письма: '" + body + '\'';
        } else {
            string = "Кому: " + recepients + "\n" +
                    "От кого: " + sender + "\n" +
                    "Тема: " + subject + "\n" +
                    "Текст письма: '" + body + '\'';
        }
        return string;
    }
}

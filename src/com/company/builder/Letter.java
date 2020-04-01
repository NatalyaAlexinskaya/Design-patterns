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
        return "Кому: " + recepients + "\n" +
                "От кого: " + sender + "\n" +
                "Тема: " + (subject == null ? "Без темы" : subject) + "\n" +
                "Текст письма: " + (body == null ? "" : '\'' + body + '\'');
    }
}

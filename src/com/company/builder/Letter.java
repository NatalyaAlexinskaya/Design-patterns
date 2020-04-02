package com.company.builder;

import java.util.Arrays;
import java.util.List;

public class Letter {
    private List<ARecepient> recepients; // получатели
    private ARecepient sender; // отправитель
    private String subject; // тема письма
    private String body; // текст письма

    public Letter(List<ARecepient> recepients, ARecepient sender, String subject, String body) {
        this.recepients = recepients;
        this.sender = sender;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Кому: " + recepients + "\n" +
                "От кого: " + sender + "\n" +
                "Тема: " + (subject == null ? "Без темы" : subject) + "\n" +
                "Текст письма: " + (body == null ? "" : '\'' + body + '\'');
    }

    public static class Builder {
        private List<ARecepient> recepients;
        private ARecepient sender;
        private String subject;
        private String body;

        public Builder setRecepients(ARecepient... recepient) {
            this.recepients = Arrays.asList(recepient);
            return this;
        }

        public Builder setSender(ARecepient sender) {
            this.sender = sender;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Letter build() {
            return new Letter(recepients, sender, subject, body);
        }
    }
}

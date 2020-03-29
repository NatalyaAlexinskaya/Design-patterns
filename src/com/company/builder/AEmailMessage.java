package com.company.builder;

import java.util.Arrays;

public class AEmailMessage implements IEmailMessage {
    private Letter letter = new Letter();

    @Override
    public Letter send() {
        return letter;
    }

    @Override
    public IEmailMessage create(ARecepient sender, ARecepient... recepient) {
        letter.setSender(sender);
        letter.setRecepients(Arrays.asList(recepient));
        return this;
    }

    @Override
    public IEmailMessage setSubject(String subject) {
        letter.setSubject(subject);
        return this;
    }

    @Override
    public IEmailMessage setBody(String body) {
        letter.setBody(body);
        return this;
    }
}

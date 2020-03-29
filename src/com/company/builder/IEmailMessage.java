package com.company.builder;

public interface IEmailMessage {
    Letter send(); // отправить письмо
    IEmailMessage create(ARecepient sender, ARecepient... recepient);// создать письмо
    IEmailMessage setSubject(String subject); //тема письма
    IEmailMessage setBody(String body); //текст письма
}

package com.company.builder;

public class ARecepient {
    private String username; // ФИО
    private String address; // адрес

    public ARecepient(String username, String address) {
        this.username = username;
        this.address = address;
    }

    @Override
    public String toString() {
        return username + " - " + address;
    }
}

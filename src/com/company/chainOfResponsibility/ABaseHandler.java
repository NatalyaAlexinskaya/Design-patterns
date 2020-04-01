package com.company.chainOfResponsibility;

public abstract class ABaseHandler {
    private ABaseHandler next;

    public void setNext(ABaseHandler next) {
        this.next = next;
    }

    public abstract void handle(int value);

    protected void validate(int value) {
        handle(value);
        if (next != null) {
            next.validate(value);
        }
    }
}

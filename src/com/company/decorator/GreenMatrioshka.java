package com.company.decorator;

public class GreenMatrioshka extends MatrioshkaDecorator {
    public GreenMatrioshka(Matrioshka matrioshka) {
        super(matrioshka);
    }

    public String printColor() { return "зеленого цвета"; }

    @Override
    public String makeMatrioshka() { return super.makeMatrioshka() + printColor(); }
}

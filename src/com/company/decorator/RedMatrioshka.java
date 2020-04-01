package com.company.decorator;

public class RedMatrioshka extends MatrioshkaDecorator {
    public RedMatrioshka(Matrioshka matrioshka) {
        super(matrioshka);
    }

    public String printColor() { return "красного цвета"; }

    @Override
    public String makeMatrioshka() { return super.makeMatrioshka() + printColor(); }
}

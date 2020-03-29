package com.company.decorator;

public class ColorMatrioshka extends MatrioshkaDecorator {
    public ColorMatrioshka(Matrioshka matrioshka) {
        super(matrioshka);
    }

    public String printColor() {
        return "красного цвета";
    }

    @Override
    public String makeMatrioshka() {
        return super.makeMatrioshka() + printColor();
    }
}

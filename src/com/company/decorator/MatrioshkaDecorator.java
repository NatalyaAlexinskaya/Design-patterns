package com.company.decorator;

public class MatrioshkaDecorator implements Matrioshka {
    Matrioshka matrioshka;

    public MatrioshkaDecorator(Matrioshka matrioshka) {
        this.matrioshka = matrioshka;
    }

    @Override
    public String makeMatrioshka() {
        return matrioshka.makeMatrioshka();
    }
}

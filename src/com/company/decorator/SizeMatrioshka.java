package com.company.decorator;

public class SizeMatrioshka extends MatrioshkaDecorator {
    public SizeMatrioshka(Matrioshka matrioshka) {
        super(matrioshka);
    }

    public String printSize() {
        return "большая ";
    }

    @Override
    public String makeMatrioshka() {
        return super.makeMatrioshka() + printSize();
    }
}

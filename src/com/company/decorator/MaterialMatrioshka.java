package com.company.decorator;

public class MaterialMatrioshka extends MatrioshkaDecorator {
    public MaterialMatrioshka(Matrioshka matrioshka) {
        super(matrioshka);
    }

    public String printMaterial() { return "деревянная "; }

    @Override
    public String makeMatrioshka() { return super.makeMatrioshka() + printMaterial(); }
}

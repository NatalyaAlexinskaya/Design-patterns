package com.company.decorator;

public class Main {
    public static void main(String[] args) {
        Matrioshka matrioshka = new ColorMatrioshka(new SizeMatrioshka(new SomeMatrioshka()));
        System.out.println(matrioshka.makeMatrioshka());
    }
}

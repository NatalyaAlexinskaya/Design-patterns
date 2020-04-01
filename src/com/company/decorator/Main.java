package com.company.decorator;

public class Main {
    public static void main(String[] args) {
        Matrioshka matrioshka1 = new SomeMatrioshka();
        System.out.println(matrioshka1.makeMatrioshka());
        Matrioshka matrioshka2 = new RedMatrioshka(new SomeMatrioshka());
        System.out.println(matrioshka2.makeMatrioshka());
        Matrioshka matrioshka3 = new RedMatrioshka(new MaterialMatrioshka(new SizeMatrioshka(new SomeMatrioshka())));
        System.out.println(matrioshka3.makeMatrioshka());
        Matrioshka matrioshka4 = new GreenMatrioshka((new SomeMatrioshka()));
        System.out.println(matrioshka4.makeMatrioshka());
        Matrioshka matrioshka5 = new GreenMatrioshka(new MaterialMatrioshka(new SomeMatrioshka()));
        System.out.println(matrioshka5.makeMatrioshka());
    }
}

package com.company.factory;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory1 = new FirstFactory();
        Car car1 = factory1.createCar();
        car1.print();

        TransportFactory factory2 = new SecondFactory();
        Car car2 = factory2.createCar();
        car2.print();

        TransportFactory factory3 = new ThirdFactory();
        Car car3 = factory3.createCar();
        car3.print();
    }
}

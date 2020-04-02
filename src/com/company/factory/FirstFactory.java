package com.company.factory;

public class FirstFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new FirstCar();
    }
}

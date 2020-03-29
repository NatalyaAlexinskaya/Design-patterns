package com.company.factory;

public class SecondFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new SecondCar();
    }
}

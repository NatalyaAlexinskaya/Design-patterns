package com.company.factory;

public class ThirdFactory implements TransportFactory {
    @Override
    public Car createCar() { return new ThirdCar(); }
}

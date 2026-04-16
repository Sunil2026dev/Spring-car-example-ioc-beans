package com.car.dealership;

public class SportsCar implements Car{

    String Owner;

    @Override
    public void getInfo() {
        System.out.println(Owner + " owns a Sorts Car");
    }

    @Override
    public void setOwnerName(String name) {
        this.Owner = name;
    }

    @Override
    public String getOwnerName() {
        return Owner;
    }
}

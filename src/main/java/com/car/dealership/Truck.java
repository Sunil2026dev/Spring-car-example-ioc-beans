package com.car.dealership;

public class Truck implements Car{

    String Owner;

    @Override
    public void getInfo() {
        System.out.println(Owner + " Owns a Truck");
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

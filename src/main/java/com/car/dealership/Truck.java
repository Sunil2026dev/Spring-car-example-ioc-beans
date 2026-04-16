package com.car.dealership;

public class Truck implements Car{

    String Owner;
    Tyre tyre;

    public Truck(Tyre tyre){      //Constructor
        this.tyre = tyre;
    }

    @Override
    public void getInfo() {
        System.out.println(Owner + " Owns a Truck" + tyre.getTyreInfo());
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

package com.car.dealership;

public class SportsCar implements Car{

    String Owner;
    Tyre tyre;

//    public SportsCar(Tyre tyre){
//        this.tyre = tyre;
//    }

    public void setTyre(Tyre tyre){
        this.tyre = tyre;
    }

    @Override
    public void getInfo() {
        System.out.println(Owner + " owns a Sports Car" + tyre.getTyreInfo());
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

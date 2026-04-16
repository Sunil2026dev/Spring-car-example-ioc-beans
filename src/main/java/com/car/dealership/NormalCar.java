package com.car.dealership;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NormalCar implements Car{

    String Owner;
    Tyre tyre;

    public NormalCar(Tyre tyre){
        this.tyre = tyre;
    }

    @Override
    public void getInfo() {
        System.out.println(Owner + " Owns a Family Car" + tyre.getTyreInfo());
    }

    @Override
    public void setOwnerName(String name) {
        this.Owner=name;
    }

    @Override
    public String getOwnerName() {
        return Owner;
    }
}

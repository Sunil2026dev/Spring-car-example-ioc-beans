package com.car.dealership;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NormalCar implements Car{

    String Owner;

    @Override
    public void getInfo() {
        System.out.println(Owner + " Owns a Family Car");
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

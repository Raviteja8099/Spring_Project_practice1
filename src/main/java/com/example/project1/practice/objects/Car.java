package com.example.project1.practice.objects;

import org.springframework.stereotype.Component;

import java.io.Serializable;


public class Car {
    private int modelNo;
    private String carName;
    private int manufactured;

    public Car(int modelNo, String carName, int manufactured) {
        super();
        this.modelNo = modelNo;
        this.carName = carName;
        this.manufactured = manufactured;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelNo=" + modelNo +
                ", carName='" + carName + '\'' +
                ", manufactured=" + manufactured +
                '}';
    }

    public int getManufactured() {
        return manufactured;
    }
}

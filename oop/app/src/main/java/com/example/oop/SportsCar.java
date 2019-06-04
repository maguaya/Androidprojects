package com.example.oop;

import android.util.Log;

import com.example.oop.Car;

public class SportsCar extends Car {

    public SportsCar(String color, String model, int doors, int speed) {
        super(color, model, doors, speed);
    }
    public void hoot(String Sound){
        Log.d("sportsCars",Sound);
    }
}

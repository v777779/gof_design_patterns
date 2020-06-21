package com.example.gofp.udemy.sol.structural.bridge;


import com.example.gofp.binding.BasePattern;
import com.example.gofp.udemy.sol.structural.bridge.classes.Audi;
import com.example.gofp.udemy.sol.structural.bridge.classes.Car;
import com.example.gofp.udemy.sol.structural.bridge.classes.Mercedes;
import com.example.gofp.udemy.sol.structural.bridge.classes.Toyota;
import com.example.gofp.udemy.sol.structural.bridge.classes.Track;
import com.example.gofp.udemy.sol.structural.bridge.classes.Vehicle;

public class Bridge extends BasePattern {

    public void main() {

        Vehicle toyotaCar = new Car(new Toyota());
        Vehicle audiTrack = new Track(new Audi());

        Vehicle mercedesCar = new Car(new Mercedes());
        Vehicle mercedesTrack = new Track(new Mercedes());

        toyotaCar.drive();
        audiTrack.drive();

        mercedesCar.drive();
        mercedesTrack.drive();

    }


}

package Structural.Bridge.Impls;

import Structural.Bridge.Car;
import Structural.Bridge.Mark;

public class Hatchback extends Car {
    public Hatchback(Mark m){super(m);}
    public void showDetails(){
        System.out.println("Hatchback");
        mark.setMark();
    }
}

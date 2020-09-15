package Structural.Bridge.Impls;

import Structural.Bridge.Car;
import Structural.Bridge.Mark;

public class Sedan extends Car {

    public Sedan(Mark m){
        super(m);
    }

    public void showDetails(){
        System.out.println("Sedan");
        mark.setMark();
    }
}

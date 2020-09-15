package Creational.Builder.BuilderSimple;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .BuildMaxSpeed(240)
                .build();
        System.out.println(car);
    }
}

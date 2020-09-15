package Creational.Builder.BuilderSimple;

/**
 * Отделяет конструирование сложного объекта от его представления,
 * так, что в результате одного и того же процесса конструирования
 * могут получаться разные представления.
 */
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

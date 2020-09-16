package Creational.Singleton.SingltonEnum;

public enum Singleton {
    INSTANCE;
    private Singleton() {
        System.out.println("Here");
    }
}


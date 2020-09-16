package Creational.Singleton.SingltonSynchronised;

public class Rnbl implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}

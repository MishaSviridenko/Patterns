package Creational.Singleton.SingltonSynchronised;

/**
 * Гарантирует, что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 1000;
        Thread t[] = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new Rnbl());
            t[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        System.out.println(Singleton.counter);
    }
}

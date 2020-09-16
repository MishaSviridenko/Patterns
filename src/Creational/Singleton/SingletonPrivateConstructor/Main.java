package Creational.Singleton.SingletonPrivateConstructor;

/**
 * Гарантирует, что у класса есть только один экземпляр,
 * и предоставляет к нему глобальную точку доступа.
 */
public class Main {
    public static void main(String[] args) {
        final int SIZE = 1000;
        Singleton arr[] = new Singleton[SIZE];
        for (int i = 0; i<SIZE; i++){
            arr[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}

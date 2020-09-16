package Creational.Singleton.SingltonSynchronised;

class Singleton {
    static int counter = 0;
    private static volatile Singleton instance = null;

    private Singleton() {
        counter++;
    }

    static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}

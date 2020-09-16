package Creational.Singleton.SingletonPrivateConstructor;

class Singleton {
    static int counter = 0;
    private static Singleton instance;
    private Singleton(){
        counter++;
    }

    static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

package Structural.Proxy;

public class RealImage implements Image{
    String file;
    RealImage(String file){
        this.file = file;
        load();
    }
    public void display(){
        System.out.println("Looking " +file);
    }

    void load(){
        System.out.println("Loading " +file);
    }
}

package Structural.Proxy;

public class ProxyImage implements Image {
    String file;
    RealImage image;

    ProxyImage(String file) {
        this.file = file;
    }

    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}
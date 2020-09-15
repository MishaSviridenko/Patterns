package Structural.Proxy;

/**
 * Является суррогатом другого объекта и контролирует доступ к нему.
 *
 * Замещает другой объект для контроля доступа к нему.
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("E:/images");
        image.display();
    } }

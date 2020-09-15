package Behavioral.TemplateMethod;

public abstract class C {
    void templateMethod() {
        System.out.println("1");
        differ();
        System.out.println("2");
    }

    public abstract void differ();

}

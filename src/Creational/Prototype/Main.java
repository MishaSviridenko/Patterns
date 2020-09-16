package Creational.Prototype;

/**
 * Должен уметь генерировать самого себя.
 * <p>
 * В JDC предусмотрен интерфейс Clonable имеющий метод clone().
 * Имплементация этого интерфейса и переопределение метода clone()
 * реализует шаблон Prototype. В методе clone() будет просто
 * создаваться объект класса реализующего интерфейс Clonable.
 */
public class Main {
    public static void main(String[] args) {
        Human original = new Human(18, "Vasya");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);
    }
}

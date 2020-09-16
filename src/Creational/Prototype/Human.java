package Creational.Prototype;

public class Human implements Copyable {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        Human human = new Human(age, name);
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

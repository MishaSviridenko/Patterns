package Behavioral.TemplateMethod;

import Behavioral.TemplateMethod.Extends.A;
import Behavioral.TemplateMethod.Extends.B;

/**
 * Шаблонный метод определяет основу алгоритма и позволяет подклассам
 * переопределить некоторые шаги алгоритма, не изменяя его структуру
 * в целом.
 * <p>
 * Шаблонный метод - решает проблему повторного использования методов.
 * Т.е. если два и более классов реализуют одинаковый кусок кода,
 * то эти классы объединяются абстрактным классом в котором реализуется
 * вышеупомянутый одинаковый кусок кода. Индивидуальные для классов
 * куски кода обозначаются в абстрактном классе как абстрактный метод
 * (пустой), а его реализации описываются в имплементациях.
 */
public class Main {
    public static void main(String[] args) {
        C c = new B();
        c.templateMethod();
        c = new A();
        c.templateMethod();
    }
}
package Structural.Decorator;

import Structural.Decorator.Extends.LeftBracketDecorator;
import Structural.Decorator.Extends.QuoteDecorator;
import Structural.Decorator.Extends.RightBracketDecorator;
import Structural.Decorator.Impls.Printer;

/**
 * Динамически добавляет объекту новые обязанности. Является
 * гибкой альтернативой порождению подклассов с целью расширения
 * функциональности.
 *
 * Decorator / Wrapper - Классы выполняют логику объединяющего их
 * абстрактного класса или интерфейса при этом вносят свои дополнения
 * (изменения). Декоратор - паттерн, структурирующий объекты.
 * Вместо абстрактного класса лучше использовать интерфейс.
 * Можно вообще не использовать абстрактный класс, тогда
 * QuoteDecorator, RightBracketDecorator, LeftBracketDecorator
 * будут имплементировать PrintInterface и внутри каждого класса
 * будет создаваться PrintInterface component.
 */
public class Main {
    public static void main(String[] args) {
        PrintInterface pr = new QuoteDecorator(
                new RightBracketDecorator(
                new LeftBracketDecorator(
                new Printer("Hi"))));
        pr.print();
    }
}

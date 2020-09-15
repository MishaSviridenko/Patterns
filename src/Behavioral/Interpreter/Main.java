package Behavioral.Interpreter;

/**
 * Предназначен для решения повторяющихся задач, которые можно
 * описать некоторым  языком. Для этого паттерн Interpreter
 * описывает решаемую задачу в виде предложений этого языка,
 * а затем интерпретирует их. Для заданного языка определяет
 * представление его грамматики, а также интерпретатор предложений
 * этого языка.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expr = context.evaluate("1+2+3");
        System.out.println(expr.interpret());
    }
}

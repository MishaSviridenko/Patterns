package Behavioral.Memento;

/**
 * Не нарушая инкапсуляции, фиксирует и выносит за пределы объекта
 * его внутреннее состояние так, чтобы позднее можно было
 * восстановить в нем объект.
 * <p>
 * Получает и сохраняет за пределами объекта его внутреннее
 * состояние так, чтобы позже можно было восстановить объект в
 * таком же состоянии. Здесь Memento - это класс объект которого
 * нужно сохранить на стороне, Originator умеет создавать объект
 * (Memento) для хранения и извлекать его,
 * Caretacer - хранит ссылку на хранимый класс Memento.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL2", 55000);
        System.out.println(game);

        System.out.println("loading");
        game.load(file.getSave());
        System.out.println(game);
    }
}

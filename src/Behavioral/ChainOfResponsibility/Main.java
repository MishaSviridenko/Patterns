package Behavioral.ChainOfResponsibility;

import Behavioral.ChainOfResponsibility.Extends.SMSLogger;

/**
 * Позволяет избежать привязки отправителя запроса к его получателю,
 * давая шанс обработать запрос нескольким объектам. Связывает
 * объекты-получатели в цепочку и передает запрос вдоль этой цепочки,
 * пока его не обработают.
 *
 * Цепочка ответственности - предназначен для организации в системе
 * уровней ответственности. В разрабатываемой системе имеется группа
 * объектов, которые могут обрабатывать сообщения определенного типа.
 * Т.о. каждый из классов обработчиков должен содержать как минимум
 * три метода: метод проверки соответствия текущему обработчику,
 * метод передачи объекта следующему обработчику и сам метод обработки.
 * Т.к. часть логики у классов обработчиков будет одинакова,
 * то создается общий абстрактный класс в который вынесена часть
 * логики.
 * Chain of Responsibility - позволяет обработать запрос нескольким
 * объектам-получателям. Получатели связываются в цепочку, и запрос
 * передается по цепочке, пока не будет обработан каким-то объектом.
 * Паттерн Chain of Responsibility позволяет также избежать жесткой
 * зависимости между отправителем запроса и его получателями.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new SMSLogger(Level.DEBUG);
        Logger logger2 = new SMSLogger(Level.INFO);
        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.writeMessage("It's alright", Level.INFO);
        logger0.writeMessage("Debuging", Level.DEBUG);
        logger0.writeMessage("System died", Level.ERROR);
    }}

package Behavioral.Command;

import Behavioral.Command.Beans.User;
import Behavioral.Command.Impls.ResetCommand;
import Behavioral.Command.Impls.StartCommand;
import Behavioral.Command.Impls.StopCommand;

/**
 * Инкапсулирует запрос как объект, позволяя тем самым задавать
 * параметры клиентов для обработки соответствующих запросов,
 * ставить запросы в очередь или протоколировать их, а также
 * поддерживать отмену операций.
 * <p>
 * Command - объект команды который включает в себе само действие
 * и его параметры. Похож на Facade, но в Facade в общий класс
 * забрасываются различные объекты со своими методами, которые
 * своей последовательностью вызовов, выполняют одно большое действие.
 * В Command в общий класс помещаются команды (методы) принадлежащие
 * одному классу ресиверу (Reciver). Похож на Адапрет, отличием
 * является наличие класса Invocer который представляет из себя
 * пользовательский интерфейс ничего не знающий о реализациях
 * интерфейсов и основного класса.
 * Command - преобразовывает запрос на выполнение действия в
 * отдельный объект-команду. Это придает системе гибкость:
 * позволяет осуществлять динамическую замену команд, использовать
 * сложные составные команды, осуществлять отмену операций.
 */
public class Main {
    public static void main(String[] args) {
        Comp c = new Comp();
        User u = new User(new StartCommand(c)
                , new StopCommand(c)
                , new ResetCommand(c));
        u.startComputer();
        u.stopComputer();
        u.resetComputer();
    }
}
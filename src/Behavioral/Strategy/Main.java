package Behavioral.Strategy;

import Behavioral.Strategy.Impls.BubbleSort;

/**
 * Определяет семейство алгоритмов, инкапсулирует каждый из них и
 * делает их взаимозаменяемыми. Стратегия позволяет изменять
 * алгоритмы независимо от клиентов, которые ими пользуются.
 * <p>
 * (похож на State) переносит семейство алгоритмов в отдельную
 * иерархию классов, что позволяет заменять один алгоритм другим
 * в ходе выполнения программы. Кроме того, такую систему проще
 * расширять и поддерживать.
 */
public class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();
        int[] arr = {1, 2, 3};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(arr);
    }
}

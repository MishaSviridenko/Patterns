package Behavioral.Strategy.Impls;

import Behavioral.Strategy.Sorting;

public class BubbleSort implements Sorting {
    public void sort(int[] arr) {
        System.out.print("bubbleSort: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}

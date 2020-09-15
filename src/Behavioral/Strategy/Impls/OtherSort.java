package Behavioral.Strategy.Impls;

import Behavioral.Strategy.Sorting;

public class OtherSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("otherSort");
        for (int i : arr) {
            System.out.println(i + ", ");
        }
    }
}

package Behavioral.Iterator;

/**
 * Предоставляет механизм обхода элементов составных объектов
 * (коллекций) не раскрывая их внутреннего представления.
 */
public class Main {
    public static void main(String[] args) {
        Tasks tsk = new Tasks();
        Iterator it = tsk.getIterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}

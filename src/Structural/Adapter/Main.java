package Structural.Adapter;

import Structural.Adapter.Interfaces.VectorGraphicsInterface;

/**
 * Преобразует интерфейс одного класса в интерфейс другого,
 * который ожидают клиенты. Адаптер обеспечивает совместную
 * работу классов с несовместимыми интерфейсами, которая без
 * него была бы невозможна.
 * <p>
 * Адаптирует старый интерфейс к новому интерфейсу.
 * В конкретном случае связывает класс RasterGraphics,
 * не реализующий интерфейс, с интерфейсом VectorGraphicsInterface.
 * Для этого используется класс VectorAdapterFromRaster.
 */
public class Main {
    public static void main(String[] args) {
        //1 variant
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        //2variant
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster1(new RasterGraphics());
        g2.drawLine();
        g2.drawSquare();
    }

}

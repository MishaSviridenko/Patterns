package Structural.Adapter;

import Structural.Adapter.Interfaces.VectorGraphicsInterface;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    public void drawLine() {
        drawRasterLine();
    }

    public void drawSquare() {
        drawRasterSquare();
    }
}
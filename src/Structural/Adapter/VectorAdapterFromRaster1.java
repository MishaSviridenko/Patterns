package Structural.Adapter;

import Structural.Adapter.Interfaces.VectorGraphicsInterface;

public class VectorAdapterFromRaster1 implements VectorGraphicsInterface {
    RasterGraphics raster;

    VectorAdapterFromRaster1(RasterGraphics raster) {
        this.raster = raster;
    }

    public void drawLine() {
        raster.drawRasterLine();
    }

    public void drawSquare() {
        raster.drawRasterSquare();
    }
}
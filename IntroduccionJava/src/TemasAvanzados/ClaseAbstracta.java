package TemasAvanzados;

import java.awt.*;

public class ClaseAbstracta {
    public static void main(String[] args) {
    FiguraGeometrica figura1 = new Triangulo();
    figura1.dibujar();
    FiguraGeometrica figura2 = new Cuadrado();
    figura2.dibujar();
    }
}

abstract class FiguraGeometrica{
    abstract void dibujar();
}

class Triangulo extends FiguraGeometrica{
    @Override
    void dibujar(){
        System.out.println("Dibujando un Triangulo...");
    }
}

class Cuadrado extends FiguraGeometrica{
    @Override
    void dibujar(){
        System.out.println("Dibujando un Cuadrado...");
    }
}

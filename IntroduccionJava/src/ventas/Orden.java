package ventas;

import java.util.Arrays;

public class Orden {
    private final int ID_ORDEN;
    private final Producto[] productos;
    private int contadorProductos;
    private static int contadorOrden;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.ID_ORDEN = ++Orden.contadorOrden;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void AgregarProducto(Producto producto){
        if(contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[contadorProductos++] = producto;
        }else{
            System.out.println("No se pudo agregar el producto, se alcazo el limite de productos: " + Orden.MAX_PRODUCTOS);
        }

    }

    public double CalcularPrecio(){
        double total = 0;
        for(var i=0; i<this.contadorProductos; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void MostrarOrden(){
        var totalOrden = this.CalcularPrecio();
        System.out.println("\t***** TICKET *****");
        System.out.println("Orden: " + this.ID_ORDEN + "\n\tProductos: \n");
        for (var i=0; i<this.contadorProductos; i++){
            System.out.println("\t" + this.productos[i]);
        }
        System.out.print("\t\t\nTotal de la orden: " + totalOrden);

    }

}

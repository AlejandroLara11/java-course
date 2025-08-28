package ventas;

import persona.Persona;

public class PruebasProducto {
    public static void main(String[] args) {
        System.out.println("\t***** PRUEBAS PRODUCTO *****");
        var producto1 = new Producto("Blusa", 30.00);
        var producto2 = new Producto("Tennis", 120.00);
        System.out.println("\tProducto: " + producto1);

        var orden1 = new Orden();
        orden1.AgregarProducto(producto1);
        orden1.AgregarProducto(producto1);
        orden1.AgregarProducto(producto2);
        orden1.MostrarOrden();

    }
}

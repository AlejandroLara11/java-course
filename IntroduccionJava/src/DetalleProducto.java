//Crear y modificar la informacion de un producto

public class DetalleProducto {
    public static void main(String[] args){
        String nombreProducto = "Agua 2lt";
        float precio = 22.5f;
        byte cantidadDisponible = 15;
        boolean estaDisponible = true;
        System.out.println("producto: " + nombreProducto);
        System.out.println("precio: " + precio);
        System.out.println("cantidad disponible: " + cantidadDisponible);
        System.out.println("esta disponible: " + estaDisponible + "\n");

        precio = 25.0f;
        cantidadDisponible = 25;
        System.out.println("Actualizacion de precios: \n");
        System.out.println("precio: " + precio);
        System.out.println("cantidad disponible: " + cantidadDisponible);
    }
}

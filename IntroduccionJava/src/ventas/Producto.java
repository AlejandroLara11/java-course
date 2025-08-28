package ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos; //por defecto toma el valor de 0

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++contadorProductos;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Id producto: " + this.idProducto +
                "\n\t\tNombre: " + this.nombre +
                "\n\t\tPrecio: " + this.precio;
    }
}



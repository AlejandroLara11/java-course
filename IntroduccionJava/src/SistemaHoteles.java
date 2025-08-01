//Nombre del cliente, dias de estancia, tarifa diaria, vista al mar.
public class SistemaHoteles {
    public static void main(String[] args){
        var nombreCliente = "Alejandro Lara";
        var diasEstancia = 5;
        var tarifaDiaria = 1800;
        var tieneVistaAlMar = true;

        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa Diaria: " + tarifaDiaria);
        System.out.println("Tiene Vista Al Mar: " + tieneVistaAlMar);

        tarifaDiaria = 1000;
        tieneVistaAlMar = false;
        System.out.println("Tarifa Diaria: " + tarifaDiaria);
        System.out.println("Tiene Vista Al Mar: " + tieneVistaAlMar);

    }
}

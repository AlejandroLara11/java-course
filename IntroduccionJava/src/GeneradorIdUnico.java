import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA GENERADOR DE ID UNICO ***\n");
        var sc = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        var nombre = sc.nextLine();

        System.out.print("Cual es tu apellido: ");
        var apellido = sc.nextLine();

        System.out.print("Cual es tu anio de nacimiento(YYYY): ");
        var fechaNacimiento = sc.nextLine();

        var extraccionNombre = nombre.substring(0,2);
        //System.out.println(extraccionNombre);

        var extraccionApellido = apellido.substring(0,2);

        var  extraccionFechaNacimiento = fechaNacimiento.substring(2);//del tercer caracter(incluido) en adelante.
        //System.out.println(extraccionFechaNacimiento);

        var numeroAleatorio = new Random().nextInt(9999)+1;

        var idGenerado = String.format("%s%s%04d%s",
                extraccionNombre,
                extraccionApellido,
                numeroAleatorio,
                extraccionFechaNacimiento).toUpperCase();

        System.out.printf("""
        Hola %s!,
        \tTu nuevo numero de Idenetificacion generado por el sistema es:
        %s
        \tFelicidades!""", nombre,  idGenerado);

    }
}

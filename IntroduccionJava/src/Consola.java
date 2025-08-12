import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, cual es su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("hola " + nombre + ", cual es su apellido: ");
        String apellido = sc.nextLine();

        StringBuffer nombreCompleto = new StringBuffer();
        nombreCompleto.append(nombre).append(" ").append(apellido);

        System.out.println("hola " + nombreCompleto + ", cual es su edad: ");
        var edad = sc.nextInt();

        System.out.println("El Usuario: " + nombreCompleto + "tiene " +  edad + "anios");
    }
}

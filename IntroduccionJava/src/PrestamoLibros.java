import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println(" ------ PRESTAMO DE LIBROS ------");
        var sc = new Scanner(System.in);
        System.out.print("Cuenta con credencial de estudiante?(true/false): ");
        var credencial =  sc.nextBoolean();
        System.out.print("A cuantos kilometros vive de la universidad: ");
        var distancia = sc.nextDouble();
        var salida = credencial || distancia <= 3 && distancia >= 0.1;

        System.out.println("Aplica para descuento?:" + salida);

    }
}

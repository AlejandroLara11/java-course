import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Double[] calificaciones = new Double[5];
        var calificacionFinal = 0.0;
        for(int i = 0; i < 5; i++){
            System.out.print("Digite la calificacion " + i + ": ");
            calificaciones[i] = sc.nextDouble();
        }
        System.out.println("Las calificaciones que ingreso fueron: ");
        for (int i = 0; i < calificaciones.length; i++){
            calificacionFinal += calificaciones[i];
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio general obtenido es de: " + (calificacionFinal / calificaciones.length));
    }
}

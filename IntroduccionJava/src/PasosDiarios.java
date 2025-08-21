import java.util.Scanner;

public class PasosDiarios {
    public static void main(String[] args) {
        System.out.println("\t***PASOS DIARIOS***");
        var sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de pasos que ha dado: ");
        float pasos = sc.nextFloat();
        final int PASOS_OBJETIVO = 1000;
        float caloriasPorPaso = 0.04f;

        float caloriasQuemadas = pasos*caloriasPorPaso;

        var salida = (pasos >= PASOS_OBJETIVO)? "Llegaste a tu objetivo diario, diste: " + pasos + ", Quemando " + caloriasQuemadas + " calorias." :
                "Lo sentimos, no llegaste a tu objetivo diario, diste: " + pasos + ", Quemando " + caloriasQuemadas + " calorias.";
        System.out.println(salida);
    }
}

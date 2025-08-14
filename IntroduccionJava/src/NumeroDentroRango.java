import java.util.Scanner;

public class NumeroDentroRango {
    public static void main(String[] args) {
        final int MINIMO = 1;
        final int MAXIMO = 10;
        System.out.print("Por favor digite un numero: ");
        var entrada = Integer.parseInt(new Scanner(System.in).nextLine());
        var salida = entrada >= MINIMO && entrada <= MAXIMO;
        System.out.println("El numero esta entre el rango de 1 a 10: " + salida);

    }
}

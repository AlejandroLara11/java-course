package sentencias;

import java.util.Scanner;

public class EjercicioTriangulo {
    public static void main(String[] args) {
        System.out.print("Digite el numero de filas de su triangulo: ");
        var filas = new Scanner(System.in).nextInt();
        for(int i = 1; i <= filas; i++){
            var espacios = " ".repeat(filas - i);
            var asteriscos = "*".repeat(2*i - 1);
            System.out.println(espacios + asteriscos);
        }
    }
}

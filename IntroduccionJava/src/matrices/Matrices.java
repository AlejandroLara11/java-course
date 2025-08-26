package matrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("\t-----matrices-----");
        System.out.print("Numero de filas: ");
        var filas = sc.nextInt();
        System.out.print("Numero de columnas: ");
        var columnas = sc.nextInt();
        var matriz = new int[filas][columnas];

        for (int fil = 0; fil < filas; fil++) {
            for (int col = 0; col < columnas; col++) {
                System.out.printf("Digite el contenido para la posicion [%d],[%d]\n", fil, col);
                matriz[fil][col] = sc.nextInt();
            }
        }

        for (int fil = 0; fil < filas; fil++) {
            System.out.println("\n");
            for (int col = 0; col < columnas; col++) {
                //System.out.printf("Contenido en la posicion [%d],[%d]: \n", fil, col);
                System.out.print(matriz[fil][col] + " ");
            }
        }
        //SUMA DIAGONAL
        var sumaDiagonal = 0;
        for (int fil = 0; fil < filas; fil++) {
            System.out.println("\n");
            for (int col = 0; col < columnas; col++) {
                if (fil == col){
                    sumaDiagonal += matriz[fil][col];
                }
            }
        }
        System.out.printf("La suma diagonal es: %d", sumaDiagonal);
    }
}
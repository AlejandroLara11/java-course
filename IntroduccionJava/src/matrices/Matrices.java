package matrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          //CREACION DE MATRIZ
          System.out.print("Digite el numero de filas: ");
          int filas = sc.nextInt();
          System.out.print("Digite el numero de columnas: ");
          int columnas = sc.nextInt();
          var matriz = new int[filas][columnas];

          //SOLICITAMOS LOS VALORES
          for (int fil = 0; fil < filas; fil++) {
              for (int col = 0; col < columnas; col++) {
                  System.out.printf("Ingrese el valor en la posicion [%d], [%d]", fil, col);
                  matriz[fil][col] = sc.nextInt();
              }
          }
          //SUMA DIAGONAL
          var sumaDiagonal = 0;
          for (int fil = 0; fil < filas; fil++) {
              for (int col = 0; col < columnas; col++){
                  if (fil == col){
                      sumaDiagonal += matriz[fil][col];
                  }
              }
          }
          System.out.println(sumaDiagonal);

    }
}
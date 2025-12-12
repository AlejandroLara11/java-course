package consola;

import java.util.Scanner;
public class RecetasCocina {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("\t***RECETAS DE COCINA***");

        System.out.println("Ingrese el nombre de la receta: ");
        var receta = sc.nextLine();

        System.out.println("Ingrese los ingredientes a utiliar separados por coma: ");
        var ingrediente = sc.nextLine();

        System.out.println("Ingrese el tiempo de preparacion de la receta (minutos): ");
        var tiempo = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingrese la dificultad de la receta(facil, dificil, experto): ");
        var dificultad = sc.nextLine();

        System.out.println("----RECETA DE COCINA----");
        System.out.println("Nombre de la receta: " + receta + "\nIngredientes: " + ingrediente + "\nTiempo de preparacion: " + tiempo + "\nNivel de dificultad: " + dificultad);
    }
}

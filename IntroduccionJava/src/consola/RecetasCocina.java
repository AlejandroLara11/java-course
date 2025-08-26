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
        var salida = new StringBuffer();
        salida.append("Nombre de la receta: " + receta).append("\nIngredientes: " + ingrediente).append("\nTiempo de preparacion: " + tiempo).append("\nNivel de dificultad: " + dificultad);
        System.out.println(salida);
    }
}

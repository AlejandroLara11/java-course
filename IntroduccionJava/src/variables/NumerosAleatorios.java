package variables;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("\t***NUMEROS ALEATORIOS***");
        var random = new Random();

        //GERENAR UN NUMERO ALEATORIO ENTRE 0 Y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero aleatorio: " + numeroAleatorio);
        //NUMERO ENTRE 1 Y 10
        var numeroAleatorio2 = random.nextInt(11);
        System.out.println("Numero aleatorio: " + numeroAleatorio2);
        //FLOTANTE ENTRE 0.0 Y 1.0
        var numeroAleatorio3 = random.nextFloat();
        System.out.println("Numero aleatorio: " + numeroAleatorio3);
        //LANZAMIENTO DE UN DADO
        var dado = random.nextInt(6)+1;
        System.out.println("Dado: " + dado);
    }
}

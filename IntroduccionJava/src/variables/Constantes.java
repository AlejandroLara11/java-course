package variables;

public class Constantes {
    public static void main(String[] args) {
        System.out.println("***variables.Constantes en Java *** \n");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA: " + DIAS_SEMANA);
        //DIAS_SEMANA = 8; no se pueden modificar.
        final var PI = Math.PI;
        System.out.println("Pi = " + PI);
    }
}

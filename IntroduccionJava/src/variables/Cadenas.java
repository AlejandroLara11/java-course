package variables;

public class Cadenas {
    public static void main(String[] args){
        var cadenaMultilinea =
                """
                con triple comilla se puede
                generar una cadena
                multilinea
                """;
        System.out.println(cadenaMultilinea);

        var cadena1 = new String("Manera formal de definir una cadena");
        System.out.println(cadena1);

        //Recuperar un caracter mediante indices
        var primerCaracter = cadena1.charAt(0);
        System.out.println("Primer caracter: " + primerCaracter);

        var ultimoCaracter = cadena1.charAt(cadena1.length() - 1);
        System.out.println("Ultimo caracter: " + ultimoCaracter);

        var largoCadena = cadena1.length();
        System.out.println("Largo cadena: " + largoCadena);

    }
}

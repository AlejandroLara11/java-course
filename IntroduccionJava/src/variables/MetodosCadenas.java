package variables;

public class MetodosCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        //Longitud
        System.out.println("La longitud de la cadena es de: " + cadena1.length() + " caracteres");

        //Reemplazar
        var nuevaCadena = cadena1.replace('a', 'o');
        System.out.println("Cadena modificada: " + nuevaCadena);

        var cadenaModificada = cadena1.replace("Mundo", "a todos");
        System.out.println("Cadena modificada: " + cadenaModificada);

        //Mayusculas
        var mayus = cadena1.toUpperCase();
        System.out.println("Cadena en mayusculas: " + mayus);

        //Minusculas
        System.out.println("Cadena en minusculas: " + cadena1.toLowerCase());

        //Eliminar espacos en blanco al principio y al final
        var cadena2 = "  Alejandro Lara    ";
        System.out.println(cadena2);
        System.out.println(cadena2.trim());


    }
}

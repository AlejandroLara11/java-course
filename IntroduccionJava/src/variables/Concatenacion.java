package variables;

public class Concatenacion {
    public static void main(String[] args) {
        System.out.println("*** CONCATENCACION DE CADENAS. *** \n");
        var nombre = "Alejandro";
        var apellido = "Lara";
        var nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre Completo: " + nombreCompleto);

        nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Nombre Completo: " + nombreCompleto);

        //StringBuilder
        var resultado = "Nombre completo: " +
                nombre +
                " " +
                apellido;
        System.out.println(resultado);

        //StringBuffer
        var salida = "Nombre completo: " + nombre + " " + apellido;
        System.out.println(salida);

        //Join para unir dos o mas cadenas
        var salidaJoin = String.join(" ", nombre, apellido);
        System.out.println("Nombre con JOIN: " + salidaJoin);

        // escapar caracteres con "\"
        System.out.println("\t\"Hola mundo\"" + "\nhttps\\\\alejandrolara.com");
    }
}

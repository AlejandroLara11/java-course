package consola;

public class ManejoSubCadenas {
    public static void main(String[] args) {
        //subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println(cadena1);

        var subCadena1 = cadena1.substring(0, 4);
        System.out.println(subCadena1);
        var subCadena2 = cadena1.substring(5, cadena1.length());
        System.out.println(subCadena2);

        //buscar subcadena con indexOf

        var indice = cadena1.indexOf("o");
        System.out.println(indice);

        var indiceFinal = cadena1.lastIndexOf("o");
        System.out.println(indiceFinal);

    }
}

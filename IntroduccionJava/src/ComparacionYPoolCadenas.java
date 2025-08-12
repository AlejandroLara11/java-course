public class ComparacionYPoolCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Hola";

        System.out.print("La cadena 1 es igual a la cadena 2 en referencias: ");
        //En este punto vamos a comparar las referencias, no el conteido para verificar que ambass variables
        //estan apuntando al mismo objeto (String);
        System.out.println(cadena1 == cadena2);

        var cadena3 = new String("Hola"); //creamos un nuevo (new) objeto
        System.out.print("La cadena 1 es igual a la cadena 3 en referencias: ");
        System.out.println(cadena3 == cadena1);

        //para comparar el contenido utilizaremos equals
        System.out.print("La cadena 1 es igual a la cadena 3 en contenido: ");
        System.out.println(cadena3.equals(cadena1));

    }
}

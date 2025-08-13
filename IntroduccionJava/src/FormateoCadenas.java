public class FormateoCadenas {
    public static void main(String[] args) {
        var edad = 28;
        var nombre = "Alejandro";
        var salario = 920.5099;

        //String.format
        var salida = String.format("Nombre: %s%nEdad: %d%nSalario: %.2f", nombre, edad, salario);
        System.out.println(salida + "\n");

        //printf
        System.out.printf("Nombre: %s%nEdad: %d%nSalario: %.2f%n",nombre, edad, salario);

        //text block
        var salida1 = """
                \nDETALLE PERSONA
                Nombre: %s
                Edad: %d anios
                Salario: %.2f
                """.formatted(nombre, edad, salario);
        System.out.println(salida1);

    }
}

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

        var numeroEmpleado = 12;
        //printf y text block, agregar ceros a la izquierda
        System.out.printf("""
                \nDETALLE PERSONA
                Nombre: %s
                Numero de Empleado: %04d
                Edad: %d anios
                Salario: %.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}

import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {

        System.out.println("*** SISTEMA DE EMPLEADOS ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del empleado: ");
        String nombreEmpleado = sc.nextLine();

        System.out.print("Ingresa el edad del empleado: ");
        int edadEmpleado = Integer.parseInt(sc.nextLine());

        System.out.print("Ingresa el salario del empleado: ");
        double salario = Double.parseDouble(sc.nextLine());

        System.out.print("Es jefe del departamento? (true/false): ");
        boolean jefeDepartamento = Boolean.parseBoolean(sc.nextLine());

        StringBuffer salida = new StringBuffer();
        salida.append("\tNombre del empleado: ").append(nombreEmpleado).append("\n\tEdad del empleado:").append(edadEmpleado).append("\n\t Salario del Empleado por mes: ").append(salario).append("\n\t Es jefe de departamento: ").append(jefeDepartamento);

        System.out.println(salida);
    }
}
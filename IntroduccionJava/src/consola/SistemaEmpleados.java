package consola;

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

        System.out.println("\tNombre del empleado: " + nombreEmpleado + "\n\tEdad del empleado:" + edadEmpleado + "\n\t Salario del Empleado por mes: " + "$%.2f".formatted(salario) + "\n\t Es jefe de departamento: " + jefeDepartamento);
    }
}
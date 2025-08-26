package sentencias;

import java.util.Scanner;

public class ReservacionHotel {
    public static void main(String[] args) {
        System.out.println("\t-----RESERVACIONES-----");
        var sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el numero de dias de estadia: ");
        var dias = sc.nextInt();
        System.out.println("Deseas vista al mar? (si / no): ");
        sc.nextLine();
        String vista = sc.nextLine();
        var conVista = 190.50;
        var sinVista = 140.50;
        Double precioTotal;
        System.out.printf("\t----- DETALLES DE LA RESERVACION ----- \n" +
                "Nombre: %s\nDias reservados: %d\nHabitacion con vista al mar: %s\n", nombre, dias, vista.toUpperCase());
        if (vista.equals("si")) {
            precioTotal = conVista * dias;
            System.out.printf("\tEl costo total de su estadia es: %.2f", precioTotal);
        } else if (vista.equals("no")) {
            precioTotal = sinVista * dias;
            System.out.printf("\tEl costo total de su estadia es: %.2f", precioTotal);
        } else {
            System.out.println("Datos invalidos, realice de nuevo el registro");
        }
    }
}
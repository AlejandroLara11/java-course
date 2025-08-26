package variables;

import java.util.Scanner;

public class ConversionDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese su estatura: ");
        double estatura = Double.parseDouble(sc.nextLine());

        System.out.println(nombre + "\n" + edad + "\n" + estatura);
    }
}
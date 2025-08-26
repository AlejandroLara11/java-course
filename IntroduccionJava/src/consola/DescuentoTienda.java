package consola;

import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {
        System.out.println("\t***TIENDA CON DESCUENTOS***");
        var sc = new Scanner(System.in);
        System.out.println("Digite su el monto de su compra: ");
        var monto = Double.parseDouble(sc.nextLine());
        System.out.println("Cuenta con membresia?(si, no): ");
        var membresia = sc.nextLine().toLowerCase();
        var descuento10 = monto*.10;
        var descuento5 = monto*.05;
        Double precioFinal;
        if (monto > 1000 && membresia.equals("si")){
            precioFinal = monto - descuento10;
            System.out.printf("El total de su compra es: %.2f, se le aplico un descuento del 10%% ($%.2f)", precioFinal, descuento10);
        }
        else if(membresia.equals("si") && monto < 1000){
            precioFinal = monto - descuento5;
            System.out.printf("El total de su compra es: %.2f, se le aplico un descuento del 5%% ($%.2f)", precioFinal, descuento5);
        }
        else{
            precioFinal = monto;
            System.out.printf("El total de su compra es: %.2f", precioFinal);
        }


    }
}

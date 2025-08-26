package sentencias;

import java.util.Scanner;

public class SentenciaIf {
    public static void main (String[] args){
        System.out.println("\t***Sentencias if***");
        System.out.print("Digite su edad: ");
        var edad = Integer.parseInt(new Scanner(System.in).nextLine());
        if (edad > 18){
            System.out.println("Es un adulto");
        }
        else if (edad < 18 && edad > 12){
            System.out.println("Es un adolescente");
        }
        else{
            System.out.println("Es un ninio");
        }



    }
}

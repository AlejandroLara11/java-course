import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("\t***OPERADOR TERNARIO***");
        var sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        var numero = sc.nextInt();
        var salida = (numero < 0) ? "El numero es menor a 0" : (numero > 0)? "El numero es mayor a 0" : "El numero es igual a 0";
        System.out.println(salida);
    }
}

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.println("***SENTENCIA SWITCH***");
        var sc = new Scanner(System.in);
        System.out.println("Digite el numero de dia: ");
        var dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Digite un numero valido del 1 al 7");


        switch (dia) {
            case 1 -> System.out.println("lunes");

            case 2 -> System.out.println("martes");

            case 3 -> System.out.println("miercoles");

            case 4 -> System.out.println("jueves");

            case 5 -> System.out.println("viernes");

            case 6-> System.out.println("sabado");

            case 7 -> System.out.println("domingo");

            default -> System.out.println("Digite un numero valido del 1 al 7");
            }
        }
    }
}
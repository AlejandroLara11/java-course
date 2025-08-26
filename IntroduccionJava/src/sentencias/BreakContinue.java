package sentencias;

public class BreakContinue {
    public static void main(String[] args) {

        //Break rompe el ciclo
        System.out.println("Impresion con break");
        for(int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }

        System.out.println("Impresion con Continue");
        //Continue salta a la siguiente iteracion
        for(int j=1; j<=10; j++){
            if(j%2 == 1){
                continue;
            }
            System.out.println(j);
        }
        }
    }

package TemasAvanzados;

public class ForEach {
    public static void main(String[] args) {
        int edades[] = {21, 23, 25, 28};
        for(int numero : edades){ //EN ESTE TIPO DE FOR, NO TENEMOS ACCESO AL INDICE
            System.out.println("Edad: "+numero);
        }
    }
}
package metodos;

public class Metodos {

    static int sumar(int a, int b){
        var res = a+b;
        return res;
    }

    static void saludar(String mensaje){
        System.out.println("Hola " + mensaje + ", Bienvenido.");
    }

    static boolean esPar(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        saludar("Alejandro");

        var resultado = sumar(2,5);
        System.out.println(resultado);

        var salida = esPar(4);
        System.out.println(salida);
    }
}

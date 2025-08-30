package TemasAvanzados;

public class MetodosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2, 3, 5);
        imprimirMezclados("Alejandro", 27, 28, 29);

    }

    private static void imprimirMezclados(String nombre, int... numeros) { //se pueden imrpimir varios tipos
        System.out.println("Nombre: " + nombre);                           //de datos pero primero van los que
        imprimirNumeros(numeros);                                          //son distintos
    }

    private static void imprimirNumeros(int... numeros) {   //recibe un arreglo de dimension N
        for(var i = 0 ; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }



}

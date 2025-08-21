public class EjercicioWhile {
    public static void main(String[] args) {
        System.out.println("\t*** EJERCICIO SUMA DE NUMEROS ***");

        var contador = 1;
        var a = 1;
        var b = 2;
        while(contador < 5){
            var c = a + b;
            a = c;
            b++;
            contador++;
            System.out.println(c);
        }


    }
}

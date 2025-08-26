package variables;

public class Operadores {
    public static void main(String[] args) {
        //operadores basicos
        System.out.println("\n-----OPERADORES BASICOS-----");

        double a = 5, b = 3, res = 0;

        res = a + b;
        System.out.println("Resultado de suma = " + res);
        res = a - b;
        System.out.println("Resultado de resta = " + res);
        res = a * b;
        System.out.println("Resultado de multiplicacion = " + res);
        res = a / b;
        System.out.println("Resultado de division = " + res);
        res = a % b;
        System.out.println("Resultado de modulo = " + res);


        //unarios
        System.out.println("\n**** OPERADORES UNARIOS ****");
        int x = 3;
        System.out.println("Resultado = " + +x );
        x = 3;
        System.out.println("Resultado = " + -x);
        x = 3;
        System.out.println("Resultado = " + ++x);
        x = 3;
        System.out.println("Resultado = " + --x);
        x = 3;
        System.out.println("Resultado = " + x++);
        x = 3;
        System.out.println("Resultado = " + x--);

        //Asignacion
        System.out.println("\n----- OPERADORES DE ASIGNACION -----");
        var num = 10;
        num -= 1;
        System.out.println("Resultado = " + num);
        num = 10;
        num += 5;
        System.out.println("Resultado = " + num);
        num = 10;
        num *= 2;
        System.out.println("Resultado = " + num);
        num = 10;
        num /= 5;
        System.out.println("Resultado = " + num);
        num = 10;
        num %= 3;
        System.out.println("Resultado = " + num);

    }
}

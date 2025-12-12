package excepciones;
public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println(resultado);
        }catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }finally {
            System.out.println("Se verifico la division entre 0");
        }
    }
}

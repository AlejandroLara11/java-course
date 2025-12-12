import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Sabado");
        lista.add("Domingo");

        for(String elemento :  lista){
            System.out.println(elemento);
        }

        //FUNCION LAMBDA
        lista.forEach(elemento -> System.out.println("Dia: " + elemento));

        //METODOS DE REFERENCIA
        lista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Alex", "Dann", "Eden");
        System.out.println("Lista de nombres: ");
        nombres.forEach(System.out::println);

    }
}

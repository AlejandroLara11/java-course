import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona =  new HashMap<>();
        persona.put("nombre", "Daniel");
        persona.put("apellido", "Lara");
        persona.put("edad", "28"); //para ingresar un tipo de dato distinto lo mejor es usar Object en Map<String, Object>

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //iterar sobre los elementos del mapa por llave o por valor por separado
        persona.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}

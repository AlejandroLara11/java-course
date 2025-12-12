import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Alex");
        conjunto.add("Dann");
        conjunto.add("Eden");
        conjunto.add("Alex");

        System.out.println("elementos del set: ");
        conjunto.forEach(System.out::println);
    }
}

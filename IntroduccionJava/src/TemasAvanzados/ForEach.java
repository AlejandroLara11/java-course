package TemasAvanzados;

public class ForEach {
    public static void main (String [] args){
        var numeros = new int[] {10,20,30,40,50};
        for(int i : numeros){
            System.out.println("Numero: " + i);
        }
    }
}
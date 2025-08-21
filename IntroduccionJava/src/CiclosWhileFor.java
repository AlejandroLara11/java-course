public class CiclosWhileFor {
    public static void main (String args[]){
        System.out.println("----- CICLOS WHILE Y DO WHILE  -----\n");
        var contador = 1;


        //CICLO WHILE
        while (contador <= 10){
            System.out.print(contador + " ");
            contador++;
        }
        do {
            System.out.println(contador);
            contador--;
        }while (contador >= 0);

        //CICLO FOR
        for(var i = 0; i<=20; i++){
            if( i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

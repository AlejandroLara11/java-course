public class FuncionRecursiva {

    static void recursividad(int num){

        if(num == 1){
            System.out.println(num);
        }
        else{
            recursividad(num-1);
            System.out.println(num + " ");
        }

    }

    public static void main(String[] args) {
        recursividad(5);
    }
}

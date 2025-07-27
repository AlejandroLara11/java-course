public class TiposDatos {
    public static void main(String[] args) {
        //VALOR POR DEFAULT 0
        byte tipoByte = 127;
        short tipoShort = 32000;
        int tipoInt = 214748647;
        long tipoLong = 9876543210L; //utilizar una l o L para indicar tipo long

        System.out.println("tipoByte = " + tipoByte);
        System.out.println("tipoShort = " + tipoShort);
        System.out.println("tipoInt = " + tipoInt);
        System.out.println("tipoLong = " + tipoLong);

        //VALOR POR DEFAULT 0.0
        //Punto flotante
        float tipoFloat = 12.3f;
        System.out.println("tipoFloat = " + tipoFloat); //f o F para indicar el tipo

        double tipoDouble = 12.34567;
        System.out.println("tipoDouble = " + tipoDouble); //d o D para indicar el tipo

        //VALOR POR DEFAULT '\u0000'
        //CARACTER
        char tipoChar = 'a';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        //VALOR POR DEFAULT False
        //Boolean
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //VALOR POR DEFAULT null
        String nombre = null;
        System.out.println("nombre = " + nombre);

        nombre = "Alejandro";
        System.out.println("nombre = " + nombre);

    }
}

public interface Traductor {

    void traducir();

    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }

}

class Ingles implements Traductor{
    @Override //en este caso el override es opcional pero buena practica ya que se esta definiendo por primera vez el metodo, no sobreescribiendo.
    public void traducir() {
        System.out.println("Traduciendo a ingles...");
    }
}
class Frances implements Traductor{
    public void traducir() { //como se ve, funciona sin @override pero es buena practica ponerlo
        System.out.println("Traduciendo a frances...");
    }
    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor desde class Frances...");
    }
    //tambien se pueden sobreescribir los metodos pero ahi si es obligatorio el @override
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor traductorIngles = new Ingles();
        traductorIngles.traducir();
        traductorIngles.iniciarTraductor();
        Traductor traductorFrances = new Frances();
        traductorFrances.traducir();
        traductorFrances.iniciarTraductor();
    }
}


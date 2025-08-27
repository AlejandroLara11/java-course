package poo;

public class Animal {

    protected void comer(){
        System.out.println("Comiendo...");
    }

    protected void dormir(){
        System.out.println("Durmiendo...");
    }

    protected void hacerSonido(){
        System.out.println("Sonido");
    }
}

class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Sonido de perro...");
    }
    @Override
    public void dormir(){
        System.out.println("Perro durmiendo...");
    }
}

class Gato extends Animal{
    @Override
    public void dormir(){
        System.out.println("Gato durmiendo...");
    }
    @Override
    public void hacerSonido(){
        System.out.println("Sonido de gato");
    }
}

class PruebaAnimal{
    //METODOS POLIMORFICOS
    static void animalDurmiendo(Animal animal){
        animal.dormir();
    }
    //METODOS POLIMORFICOS
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        var animalPrueba  = new Animal();
        System.out.println("Realizando prueba con ANIMAL...");
        animalPrueba.comer();
        animalPrueba.dormir();

        var perroPrueba = new Perro();
        System.out.println("\nRealizando prueba con PERRO...");
        perroPrueba.comer();
        perroPrueba.dormir();
        perroPrueba.hacerSonido();

        var GatoPrueba = new Gato();
        System.out.println("\nMETODOS POLIMORFICOS");
        imprimirSonido(GatoPrueba);
        animalDurmiendo(perroPrueba);

    }
}
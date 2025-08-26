package poo;

public class Animal {

    public void comer(){
        System.out.println("Comiendo...");
    }

    public void dormir(){
        System.out.println("Durmiendo...");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Ladrando...");
    }

    @Override
    public void dormir(){
        System.out.println("Durmiendo 10 horas al dia...");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        var animalPrueba  = new Animal();
        System.out.println("Realizando prueba con ANIMAL...");
        animalPrueba.comer();
        animalPrueba.dormir();

        var perroPrueba = new Perro();
        System.out.println("Realizando prueba con PERRO...");
        perroPrueba.comer();
        perroPrueba.dormir();
        perroPrueba.hacerSonido();

    }
}
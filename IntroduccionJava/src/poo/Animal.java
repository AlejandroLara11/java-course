package poo;

public class Animal {

    public void Comer(){
        System.out.println("Comiendo...");
    }

    public void Dormir(){
        System.out.println("Durmiendo...");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Ladrando...");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        var animalPrueba  = new Animal();
        System.out.println("Realizando prueba con ANIMAL...");
        animalPrueba.Comer();
        animalPrueba.Dormir();

        var perroPrueba = new Perro();
        System.out.println("Realizando prueba con PERRO...");
        perroPrueba.Comer();
        perroPrueba.Dormir();
        perroPrueba.hacerSonido();

    }
}
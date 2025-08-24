public class Persona{
    String nombre;
    String apellido;
    int edad;

    public  Persona(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    void DetallePersona(){
        System.out.println("Nombre: "+nombre + "\nApellido: "+apellido +  "\nEdad: "+edad);
    }

    public static void main(String[] args) {
    var persona = new Persona("Alejandro", "Lara", 28);
    persona.DetallePersona();
    }
}


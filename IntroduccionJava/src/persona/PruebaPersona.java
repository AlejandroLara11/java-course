package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        //Creamos el objeto
        var persona = new Persona("Alejandro", "Lara", 27);
        //Obtenemos sus valores a traves de los get
        var nombre = persona.getNombre();
        System.out.println("Nombre actual: " + nombre);
        var edad = persona.getEdad();
        System.out.println("Edad actual: " +  edad);
        var apellido = persona.getApellido();
        System.out.println("Apellido actual: " + apellido);

        //Si queremos modificr los valores del objeto tiene que ser mediante los set
        //persona.nombre = "Daniel";
        //persona.apellido = "Alvarado";
        //persona.edad = 28;

        persona.setNombre("Daniel");
        System.out.println("Nombre modificado: " + persona.getNombre());
        persona.setApellido("Alvarado");
        System.out.println("Apellido modificado: " + persona.getApellido());
        persona.setEdad(28);
        System.out.printf("Edad modificada: %d", persona.getEdad());

    }
}

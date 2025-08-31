package javabeans;

import java.io.Serializable;

class JavaBeans{
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Alejandro");
        usuario1.setEdad(28);
        var nombre_usuario = usuario1.getNombre();
        var edad_usuario = usuario1.getEdad();
        System.out.println("Nombre: " + nombre_usuario);
        System.out.println("Edad: " + edad_usuario);
        System.out.println("Informacion del usuario: \n" + usuario1);
    }
}

class Usuario implements Serializable{
    private String nombre;
    private int edad;

    public Usuario(){}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    @Override
    public String toString(){
        return "Nombre: " +  this.nombre + "\nEdad: " + this.edad;
    }
}


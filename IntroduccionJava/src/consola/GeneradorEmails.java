package consola;

public class GeneradorEmails {
    public static void main(String args[]){

        var nombre = " Alejandro";
        var apellido = "Lara ";
        var empresa = "Ibaten Elevators";
        //GENERAR NOMBRE DE USUARIO SIN ESPACIOS
        var nombreUsuario = nombre + " " + apellido;
        nombreUsuario = nombreUsuario.strip();
        //NORMALIZAMOS EL NOMBRE DE USUARIO
        var nombreUsuarioNormalizado = nombre.strip().toLowerCase() + "." +  apellido.strip().toLowerCase();
        //DEFINIMOS LA EXTENSION DE DOMINIO
        var extensionDominio = ".com.mx";
        //NORMALIZAMOS EL DOMINIO
        var dominioNormalizado = new StringBuffer();
        dominioNormalizado.append("@").append(empresa.replaceAll(" ", "").toLowerCase());
        //CONSTRUIMOS EL EMAIL APOYANDONOS DE DISTINTOS METODOS.
        var email = new StringBuffer();
        email.append(nombreUsuarioNormalizado).append(dominioNormalizado).append(extensionDominio);


        System.out.println("**GENERADOR DE EMAILS**\n");
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Nombre de usuario normalizado: " + nombreUsuarioNormalizado + "\n");

        System.out.println("\nEmpresa: " + empresa.toUpperCase());
        System.out.println("Extension de dominio: " + extensionDominio);
        System.out.println("Dominio normalizado: " + dominioNormalizado);
        System.out.println("\nEmail generado: " + email.toString());

    }
}
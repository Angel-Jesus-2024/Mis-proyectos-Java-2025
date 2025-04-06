/* 

   Log In by Angel Jesús Cahuich Colli

   Facultad de Ingeniería Universidad Autónoma de Campeche

   Ingeniería en Sistemas Computacionales

   Matrícula: 75857

   Fecha de elaboración: Martes 25 de Maro del 2025

   Descripción: Programa que simula un inicio de sesión 
   con 4 usuarios y 4 contraseñas predefinidos.

   2025 © Angel Jesús Cahuich Colli. Todos los derechos reservados.
   
 */


import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usuarios y contraseñas
        String usuario1 = "Angel";
        String contraseña1 = "Angel123";
        String usuario2 = "Chepo";
        String contraseña2 = "Chepo123";
        String usuario3 = "Santiago";
        String contraseña3 = "Santo123";
        String usuario4 = "Administrador";
        String contraseña4 = "Admin123";

        // Verificación del usuario
        verificarUsuario(scanner, usuario1, contraseña1, usuario2, contraseña2, usuario3, contraseña3, usuario4, contraseña4);

        scanner.close();
    }

    public static void verificarUsuario(Scanner scanner, String usuario1, String contraseña1, String usuario2, String contraseña2, String usuario3, String contraseña3, String usuario4, String contraseña4) {
        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        if (usuarioIngresado.equals(usuario1)) {
            verificarContraseña(scanner, contraseña1, usuario1);
        } else if (usuarioIngresado.equals(usuario2)) {
            verificarContraseña(scanner, contraseña2, usuario2);
        } else if (usuarioIngresado.equals(usuario3)) {
            verificarContraseña(scanner, contraseña3, usuario3);
        } else if (usuarioIngresado.equals(usuario4)) {
            verificarContraseña(scanner, contraseña4, usuario4);
        } else {
            System.out.println("Usuario incorrecto. Inténtelo de nuevo.");
        }
    }

    public static void verificarContraseña(Scanner scanner, String contraseñaCorrecta, String usuarioCorrecto) {
        boolean accesoConcedido = false;

        while (!accesoConcedido) {
            System.out.print("Ingrese su contraseña: ");
            String contraseñaIngresada = scanner.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("¡Bienvenido, " + usuarioCorrecto + "!");
                accesoConcedido = true;
            } else {
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            }
        }
    }
}
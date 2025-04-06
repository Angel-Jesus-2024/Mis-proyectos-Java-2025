/* ConversiónDelDolar by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

//Este programa convierte dólares a pesos mexicanos.

import java.util.Scanner; // Importa la clase Scanner para leer datos del usuario

public class ConversionDelDolar {
    public static void main(String[] args) {
        // Mensaje inicial
        System.out.println("Por favor, ingrese la cantidad de dinero en dólares:");

        // Crear un objeto Scanner para leer datos del teclado
        Scanner scanner = new Scanner(System.in);

        // Leer el valor en dólares introducido por el usuario
        double dolar = scanner.nextDouble();

        // Conversión de dólares a pesos (tipo de cambio: 20.27)
        double pesos = dolar * 20.27;

        // Mostrar el resultado de la conversion
        System.out.println("La conversión en pesos mexicanos es: $" + pesos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

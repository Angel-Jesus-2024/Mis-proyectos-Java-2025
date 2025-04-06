/* Varianza by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;

public class CalculoDeVarianza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0.0, media, varianza = 0.0;

        // Leer los 10 numeros
        System.out.println("Introduce 10 numeros:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double num5 = scanner.nextDouble();
        double num6 = scanner.nextDouble();
        double num7 = scanner.nextDouble();
        double num8 = scanner.nextDouble();
        double num9 = scanner.nextDouble();
        double num10 = scanner.nextDouble();

        // Calcular la suma
        suma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

        // Calcular la media
        media = suma / 10;

        // Calcular la varianza
        varianza = (Math.pow(num1 - media, 2) + Math.pow(num2 - media, 2) + Math.pow(num3 - media, 2) +
                    Math.pow(num4 - media, 2) + Math.pow(num5 - media, 2) + Math.pow(num6 - media, 2) +
                    Math.pow(num7 - media, 2) + Math.pow(num8 - media, 2) + Math.pow(num9 - media, 2) +
                    Math.pow(num10 - media, 2)) / 10;

        // Mostrar el resultado
        System.out.println("La varianza es: " + varianza);
    }
}

/* Distancia entre 2 Puntos by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la coordenada x1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Ingresa la coordenada y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Ingresa la coordenada x2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Ingresa la coordenada y2: ");
        double y2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

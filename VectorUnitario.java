/* Vector Unitario by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

/*El objetivo es pedir 3 numeros elevarlos al cuadrado luego sumas el resultado y 
se le saca la raiz de la suma y luego el resultado se divide entre los primero numeros dados*/

import java.util.Scanner;

public class VectorUnitario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // lee 3 numeros del usuario
        double[] v = new double[3];
        System.out.println("Introduce el primer número:");
        v[0] = scanner.nextDouble();
        System.out.println("Introduce el segundo número:");
        v[1] = scanner.nextDouble();
        System.out.println("Introduce el tercer número:");
        v[2] = scanner.nextDouble();
        
        // eleva cada numero al cuadrado y sumalos
        double suma = v[0] * v[0] + v[1] * v[1] + v[2] * v[2];
        
        // saca la raiz cuadrada de la suma 
        double v_x = Math.sqrt(suma);
        
        // divide cada numero entre v_x
        double[] vector_unitario = {v[0] / v_x, v[1] / v_x, v[2] / v_x};
        
        System.out.println("El primer valor del vector unitario es " + vector_unitario[0]);
        System.out.println("El segundo valor del vector unitario es " + vector_unitario[1]);
        System.out.println("El tercer valor del vector unitario es " + vector_unitario[2]);
        
        scanner.close();
    }
}
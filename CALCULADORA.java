/* 

Calculadora by Angel Jesús Cahuich Colli

   Facultad de Ingeniería Universidad Autónoma de Campeche

   Ingeniería en Sistemas Computacionales

   Matrícula: 75857

   Fecha de elaboración: Martes 25 de Maro del 2025

   Descripción: Calculadora que realiza operaciones básicas 
   como suma, resta, multiplicación, división, potencia, 
   raíz cuadrada y división de fracciones.

   2025 © Angel Jesús Cahuich Colli. Todos los derechos reservados.
   
 */

import java.util.Scanner;

public class CALCULADORA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora de Angel Jesús");
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número (si aplica, de lo contrario ingrese 0): ");
            double num2 = scanner.nextDouble();

            System.out.println("Seleccione la operación: ");
            System.out.println("+ para Suma");
            System.out.println("- para Resta");
            System.out.println("* para Multiplicación");
            System.out.println("/ para División");
            System.out.println("^ para Potencia");
            System.out.println("r para Raíz cuadrada del primer número");
            System.out.println("f para División de fracciones (num1/num2)");
            System.out.println("x para Salir");

            System.out.print("Ingrese la operación: ");
            char operacion = scanner.next().charAt(0);

            double resultado = 0;
            boolean operacionValida = true;

            if (operacion == '+') {
                resultado = num1 + num2;
            } else if (operacion == '-') {
                resultado = num1 - num2;
            } else if (operacion == '*') {
                resultado = num1 * num2;
            } else if (operacion == '/') {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    operacionValida = false;
                }
            } else if (operacion == '^') {
                resultado = Math.pow(num1, num2);
            } else if (operacion == 'r') {
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                } else {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    operacionValida = false;
                }
            } else if (operacion == 'f') {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La fracción es: " + (int) num1 + "/" + (int) num2);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    operacionValida = false;
                }
            } else if (operacion == 'x') {
                System.out.println("Saliendo de la calculadora...");
                continuar = false;
                continue;
            } else {
                System.out.println("Operación no válida.");
                operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            if (continuar) {
                System.out.println("¿Desea realizar otra operación? (s/n): ");
                char respuesta = scanner.next().charAt(0);
                if (respuesta != 's' && respuesta != 'S') {
                    continuar = false;
                }
            }
        }

        System.out.println("Gracias por usar la calculadora de Angel Jesús. ¡Hasta pronto!");
        scanner.close();
    }
}

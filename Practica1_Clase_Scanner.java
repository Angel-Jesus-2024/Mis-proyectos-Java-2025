/* Vector Unitario by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

/*POWERED BY VISUAL STUDIO CODE COPILOT*/

import java.util.Scanner;

public class Practica1_Clase_Scanner {
    public static void main(String[] args) {
        // Información sobre los tipos de datos primitivos
        System.out.println("Tipos de datos primitivos en Java:");
        System.out.println("byte: Tamaño en memoria: 1 byte, Rango: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE + ", Valor por defecto: 0");
        System.out.println("short: Tamaño en memoria: 2 bytes, Rango: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE + ", Valor por defecto: 0");
        System.out.println("int: Tamaño en memoria: 4 bytes, Rango: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE + ", Valor por defecto: 0");
        System.out.println("long: Tamaño en memoria: 8 bytes, Rango: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE + ", Valor por defecto: 0L");
        System.out.println("float: Tamaño en memoria: 4 bytes, Rango: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE + ", Valor por defecto: 0.0f");
        System.out.println("double: Tamaño en memoria: 8 bytes, Rango: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE + ", Valor por defecto: 0.0d");
        System.out.println("char: Tamaño en memoria: 2 bytes, Rango: " + (int) Character.MIN_VALUE + " a " + (int) Character.MAX_VALUE + ", Valor por defecto: '\\u0000'");
        System.out.println("boolean: Tamaño en memoria: 1 bit, Valores posibles: " + Boolean.FALSE + " y " + Boolean.TRUE + ", Valor por defecto: false");

        // Leer y mostrar los diferentes tipos de datos primitivos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("Valor ingresado: " + byteValue);

        System.out.print("Ingrese un valor short: ");
        short shortValue = scanner.nextShort();
        System.out.println("Valor ingresado: " + shortValue);

        System.out.print("Ingrese un valor int: ");
        int intValue = scanner.nextInt();
        System.out.println("Valor ingresado: " + intValue);

        System.out.print("Ingrese un valor long: ");
        long longValue = scanner.nextLong();
        System.out.println("Valor ingresado: " + longValue);

        System.out.print("Ingrese un valor float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Valor ingresado: " + floatValue);

        System.out.print("Ingrese un valor double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Valor ingresado: " + doubleValue);

        System.out.print("Ingrese un valor char: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Valor ingresado: " + charValue);

        System.out.print("Ingrese un valor boolean: ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Valor ingresado: " + booleanValue);

        scanner.close();
    }
}
/* Tipos de datos by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;
public class Tiposdedatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un byte: ");
        byte byteValue = scanner.nextByte();
        
        System.out.print("Ingrese un short: ");
        short shortValue = scanner.nextShort();
        
        System.out.print("Ingrese un int: ");
        int intValue = scanner.nextInt();
        
        System.out.print("Ingrese un long: ");
        long longValue = scanner.nextLong();
        
        System.out.print("Ingrese un float: ");
        float floatValue = scanner.nextFloat();
        
        System.out.print("Ingrese un double: ");
        double doubleValue = scanner.nextDouble();
        
        System.out.print("Ingrese un boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.print("Ingrese un caracter: ");
        char charValue = scanner.next().charAt(0);
        
        System.out.println("\nValores ingresados:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("char: " + charValue);
        
        scanner.close();
    }
}

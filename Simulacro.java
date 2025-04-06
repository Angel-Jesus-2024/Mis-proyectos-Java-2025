/* Simulacro del exámen by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;

public class Simulacro {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Hola, Soy Angel tu asistente virtual ingrese su nombre:");
    String nombre = leer.nextLine();
    System.out.println("Hola " + nombre + ", ¡mucho gusto!");

    System.out.println("Ingrese los nombres de 5 productos:");
    String[] productos = new String[5];
    for (int i = 0; i < 5; i++) {
      productos[i] = leer.nextLine();
    }

    System.out.println("Ingrese los precios de los productos:");
    double[] precios = new double[5];
    for (int i = 0; i < 5; i++) {
      precios[i] = leer.nextDouble();
    }

    System.out.println("Ingrese las cantidades de los productos:");
    int[] cantidades = new int[5];
    for (int i = 0; i < 5; i++) {
      cantidades[i] = leer.nextInt();
    }

    System.out.println("Factura:");
    double subtotal = 0;
    for (int i = 0; i < 5; i++) {
      double totalProducto = cantidades[i] * precios[i];
      subtotal += totalProducto;
      System.out.println(productos[i] + " - " + cantidades[i] + " unidades - $" + precios[i] + " c/u - Total: $" + totalProducto);
    }
    int totaldeunidades = 0;
    for (int i = 0; i < 5; i++) {
      totaldeunidades += cantidades[i];
    }
    System.out.println("Total de unidades en su carrito es: " + totaldeunidades);

    System.out.println("El subtotal de la compra es: $" + subtotal);

    double descuento = subtotal * 0.20;
    double totalConDescuento = subtotal - descuento;
    System.out.println("El total con un descuento del 20% es: $" + totalConDescuento);

    double iva = subtotal * 0.16;
    System.out.println("El IVA del 16% sobre el subtotal es: $" + iva);

    double totalConIva = totalConDescuento + iva;
    System.out.println("El total de la compra con IVA es: $" + totalConIva);

    System.out.println("Adiós " + nombre + ", gracias por su compra");

    leer.close();
  }
}
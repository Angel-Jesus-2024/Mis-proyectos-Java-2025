/* Práctica 1 by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;

public class Practica1 {
  public static void main(String[] args) {
  // Primera parte : Declaracion de variables primitivas
  boolean booleano;
  char caracter;
  byte numeromuyPequeno;
  short numeroPequeno;
  int entero;
  long largo;
  float flotante;
  double doble;
  // Segunda parte: Diferencias entre los tipos de datos primitivos
  entero = 97;
  doble = 97;
  caracter = 97;
  System.out.println("El valor 97 como entero es: " + entero);
  System.out.println("El valor 97 como doble es: " + doble);
  System.out.println("El valor 97 como caracter es: " + caracter);
  // Tercera parte: Variables de Referencia
  String cadena = new String("Variables de Referencia!");
  Scanner lector = new java.util.Scanner(System.in);
  System.out.println("¡Los Strings en Java son " + cadena);
  System.out.println("");
  // Cuarta parte: Literales
  booleano = true;
  caracter = '7';
  System.out.println(booleano);
  System.out.println(caracter);
  System.out.println("");
  booleano = false;
  caracter = '\u0037';
  System.out.println(booleano);
  System.out.println(caracter);
  caracter = '\n';
  System.out.println("El caracter salto de linea en accion: ");
  System.out.println(caracter);
  flotante = 3.14159265f;
  System.out.println(flotante);
  cadena = "¡Puedes asignar valores a un String con literales!";
  System.out.println(cadena);
  System.out.println(caracter);
  System.out.println("¿Cómo te llamas?: ");
  String nombre = lector.nextLine();
  System.out.println("¿Cuántos años tienes?: ");
  int edad = lector.nextInt();
  System.out.println("¡Te llamas " + nombre
  + " y tienes " + edad + " años");


 }
}
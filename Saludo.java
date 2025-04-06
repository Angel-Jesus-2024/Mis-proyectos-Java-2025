/* Saludo by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

public class Saludo {
	public static void main (String[] args) {
	 /*La simbología anterior indica que se puede poner un comentario
	 que abarque varias líneas*/
		
	 System.out.println("Programa de saludo");
		
	 System.out.println("¿Cuál es tu nombre?");
		
	 //La siguiente línea lee el nombre del usuario, permite recibir la información del usuario
	 //String es para almacenar una variable que contiene texto
		
	 //La siguiente línea recibe el nombre del usuario
	 String nombre = new java.util.Scanner(System.in).nextLine();
		
         //La siguiente línea pregunta el apellido
         System.out.println("¿Cuál es tu apellido?");
		
	 //La siguiente línea recibe el apellido del usuario
	 String Apellido = new java.util.Scanner(System.in).nextLine();
		
	 //Esta operación es la concatenación de 2 cadenas de texto en una sola
	 System.out.println("Hola " + nombre +  " " + Apellido + "!");
	 
	}
}
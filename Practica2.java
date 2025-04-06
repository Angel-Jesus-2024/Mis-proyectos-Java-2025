/* Práctica 2 by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

public class Practica2 {
	public static void main(String[] args) {
		//Primera parte : Declaracion y construccion de arreglos
		int[] arreglo;
		int tamanoArreglo = 5;
		arreglo = new int[tamanoArreglo];
		
		System.out.println("Los" + arreglo.length +
			" elementos del arreglo: ");
		System.out.println(arreglo[0]);
                System.out.println(arreglo[1]);
	        System.out.println(arreglo[2]);
                System.out.println(arreglo[3]);
                System.out.println(arreglo[4]);
		// Segunda parte: Inicializacion automatica
                int[] calificaciones = { 10, 8, 6, 9, 9, 7};
                System.out.println("Los " + calificaciones.length +
                " elementos de calificaciones: ");
                System.out.println("Elemento 1: " + calificaciones[0]);
                System.out.println("Elemento 2: " + calificaciones[1]);
                System.out.println("Elemento 3: " + calificaciones[2]);
                System.out.println("Elemento 4: " + calificaciones[3]);
                System.out.println("Elemento 5: " + calificaciones[4]);
		System.out.println("Elemento 6: " + calificaciones[5]);
		// Tercera parte: Arreglos multidimensionales
                int[][] matriz = new int[2][2];
                matriz[0][0] = 11;
                matriz[0][1] = 12;
                matriz[1][0] = 21;
                matriz[1][1] = 22;
                System.out.println("Una matriz de 2 x 2:");
                System.out.println("[" + matriz[0][0] + " " + matriz[0][1] + "]");
		System.out.println("[" + matriz[1][0] + " " + matriz[1][1] + "]");
		int[][] noMatriz = { {1, 2, 3} , {4, 5} , {6, 7, 8, 9} };
                System.out.println("Una no-matriz inicializada automaticamente: ");
                System.out.println("[" + noMatriz[0][0] + " " + noMatriz[0][1] +
                " " + noMatriz[0][2] + "]");
                System.out.println("[" + noMatriz[1][0] + " " + noMatriz[1][1] +
                "]");
                System.out.println("[" + noMatriz[2][0] + " " + noMatriz[2][1] +
		" " + noMatriz[2][2] + " " + noMatriz[2][3] + "]");
		// Cuarta parte : Operadores
                // Operadores unarios
                int x = 10;
                int y = 10;
	        boolean b = false;
                // Operadores de incremento
                System.out.println("Valor inicial de x : " + x);
                System.out.println("Valor inicial de y : " + y);
                System.out.println("Valor de X con pre-incremento : " + ++x);
                System.out.println("Valor de Y con pos-incremento : " + y++);
                System.out.println("Valor final de x : " + x);
                System.out.println("Valor final de y : " + y);
                // Operadores positivo / negativo | complemento booleano
                System.out.println("El negativo de x es : " + -x);
		System.out.println("El complemento de b es : " + !b);
		// Operador cast
                x = (int) 5.9999999999; // (10 nueves)
                System.out.println("Casteando un doble en entero : " + x);
		// Operadores binarios
                // Operadores aritmeticos
                x = 5;
                y = 5;
                System.out.println("Suma : 5 + 5 = " + (x + y));
                System.out.println("Resta : 5 - 5 = " + (x - y));
                System.out.println("Multiplicacion : 5 * 5 = " + (x * y));
		System.out.println("Division : 5 / 5 = " + (x / y));
                System.out.println("Modulo : 5 % 5 = " + (x % y));
                // Concatenacion
		String frase1 = "El operador Suma (+) ";
                String frase2 = "tambien une cadenas de texto";
		System.out.println(frase1 + frase2);
                // Division entera
                x = 7;
                y = 4;
                double z = x / y; // El resultado real es 1.75
                System.out.println("La division 7 / 4 es : " + z);
		// Operadores lógico-relacionales
                b = (x > y); // ¿7 mayor que 4? – si
		boolean b2 = (x < y); // ¿7 menor que 4? - no
                boolean b3 = (x != y); // ¿7 diferente de 4? – si
                System.out.println(" 7 > 4 AND 7 < 4? : " + (b && b2));
		System.out.println(" 7 > 4 OR 7 < 4? : " + (b || b2));
                System.out.println(" 7 > 4 AND 7 != 4? : " + (b && b3));
                System.out.println(" 7 > 4 OR 7 != 4? : " + (b || b3));
                System.out.println("¿frase1 es un String? " +
                (frase1 instanceof String));
		// Operadores de Asignación
                System.out.println("¡Hemos estado utilizando el operador " +
                "Asignación desde el principio! ¿Lo habías notado?");
		x = 10;
                y = 10;
                x += 20;
                y = y + 20;
                System.out.println("Valor de x: " + x);
                System.out.println("Valor de y: " + y);
	}
}
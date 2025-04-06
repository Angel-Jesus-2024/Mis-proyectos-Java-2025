/* Cinepolis by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;

public class Cinepolis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo que muestra las películas disponibles
        String[] peliculas = {"1. Super Mario Bros", "2. Toy Story", "3. Barbie", "4. Oppenheimer"};
        System.out.println("Películas disponibles:");
        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Elige una película (número):");
        int peliculaIndex = scanner.nextInt() - 1;
        String peliculaElegida = peliculas[peliculaIndex].substring(3); 

        // Horarios disponibles
        String[] horarios = {"1. 12:30", "2. 13:00", "3. 17:30", "4. 20:00"};
        System.out.println("Horarios disponibles:");
        for (String horario : horarios) {
            System.out.println(horario);
        }

        System.out.println("Elige un horario (número):");
        int horarioIndex = scanner.nextInt() - 1;
        String horarioElegido = horarios[horarioIndex].substring(3); 

        // Butacas disponibles
        String[][] butacas = new String[5][5];
        int contador = 1;
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = "[" + contador++ + "]";
            }
        }

        System.out.println("Butacas disponibles:");
        char fila = 'A';
        for (String[] filaButacas : butacas) {
            System.out.print(fila++ + " ");
            for (String butaca : filaButacas) {
                System.out.print(butaca + " ");
            }
            System.out.println();
        }

        System.out.println("Elige tus butacas (separadas por comas):");
        scanner.nextLine(); 
        String butacasElegidas = scanner.nextLine();

        // Calcular el precio
        int numeroButacas = butacasElegidas.split(",").length;
        int precioPorButaca = 70; 
        int precioTotal = numeroButacas * precioPorButaca;

        // Ticket de compra
        System.out.println("Ticket de compra");
        System.out.println("Película a ver: " + peliculaElegida);
        System.out.println("Horario de entrada: " + horarioElegido);
        System.out.println("Asientos: " + butacasElegidas);
        System.out.println("Precio total: $" + precioTotal + " MXN");
    }
}

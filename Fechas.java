/* Fechas by Angel Jesús Cahuich Colli.
2B ISC
Facultad de Ingeniería Campus V
Universidad Autónoma de Campeche 
2025 © Todos los derechos reservados */

import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento (DD/MM/YY): ");
        String fechaNacimiento = scanner.nextLine();

        String[] partes = fechaNacimiento.split("/");
        int diaNacimiento = Integer.parseInt(partes[0]);
        int mesNacimiento = Integer.parseInt(partes[1]);
        int anioNacimiento = Integer.parseInt(partes[2]);
        
        if (anioNacimiento <= 25) {
            anioNacimiento += 2000;
        } else { 
            anioNacimiento += 1900; 
        }
       
        int diaActual = 7;
        int mesActual = 3;
        int anioActual = 2025;

        int diasVividos = (anioActual - anioNacimiento) * 360; 
        diasVividos += (mesActual - mesNacimiento) * 30;
        diasVividos += (diaActual - diaNacimiento); 

        if (diasVividos < 0) {
            diasVividos = -diasVividos;
        }

        System.out.println("Llevas vivo aproximadamente " + diasVividos + " días.");

        scanner.close();
    }
}

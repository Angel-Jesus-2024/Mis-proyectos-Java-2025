import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args) {
        int Calificacion;
        System.out.println("¿Cuál es tu calificación en programación?"); ;
        Calificacion = new Scanner(System.in). nextInt();
        if (Calificacion >= 7) {
            System.out.println("¡Felicidades, aprobaste!");
        } else {
            System.out.println("Lo siento, reprobaste.");
        }
            System.out.println("Fin del Programa.");
        }
        
}

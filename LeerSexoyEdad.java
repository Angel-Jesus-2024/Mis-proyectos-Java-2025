import java.util.Scanner;

public class LeerSexoyEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo;
        int edad;
        boolean datosValidos = false;

        while (!datosValidos) {
            System.out.println("Introduce tu sexo (H/M): ");
            sexo = scanner.nextLine();

            if (!sexo.equals("H") && !sexo.equals("M")) {
                System.out.println("Dato inválido, intenta de nuevo.");
                continue; 
            }

            System.out.println("Introduce tu edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();

            if (sexo.equals("H") && edad >= 18) {
                System.out.println("¿Ya tienes tu cartilla?");
            }

            datosValidos = true;
        }

        scanner.close();
    }
}
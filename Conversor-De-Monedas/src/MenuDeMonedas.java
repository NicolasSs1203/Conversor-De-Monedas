import java.util.Scanner;

public class MenuDeMonedas {

    public static void main(String[] args) {
        ConsultaMonedas consulta = new ConsultaMonedas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción para convertir monedas:");
            System.out.println("1. COP a USD");
            System.out.println("2. USD a COP");
            System.out.println("3. COP a EUR");
            System.out.println("4. EUR a COP");
            System.out.println("5. COP a ARS");
            System.out.println("6. ARS a COP");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            double resultado;
            switch (opcion) {
                case 1 -> resultado = consulta.convierteMoneda("COP", "USD", monto);
                case 2 -> resultado = consulta.convierteMoneda("USD", "COP", monto);
                case 3 -> resultado = consulta.convierteMoneda("COP", "EUR", monto);
                case 4 -> resultado = consulta.convierteMoneda("EUR", "COP", monto);
                case 5 -> resultado = consulta.convierteMoneda("COP", "ARS", monto);
                case 6 -> resultado = consulta.convierteMoneda("ARS", "COP", monto);
                default -> {
                    System.out.println("Opción no válida. Intente de nuevo.");
                    continue;
                }
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}


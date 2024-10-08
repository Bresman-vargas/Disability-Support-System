package disabilitymanager;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author bresm
 */
public class MenuPrincipal {
    public static void main(String[] args) {
        System.out.print("hola");
        BeneficiarioManager.inicializarDatosBE();
        ServicioManager.inicializarDatosSE();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Utilidades.limpiarPantalla();
            
            System.out.println("===============================================");
            System.out.println("Sistema de Gestión de Servicios");
            System.out.println("Atención a Personas con Discapacidad");
            System.out.println("===============================================");
            System.out.println("1. Registro de Beneficiarios");
            System.out.println("2. Administración de Servicios de Apoyo");
            System.out.println("3. Seguimiento de Impacto");
            System.out.println("4. Gestión de Múltiples Beneficiarios");
            System.out.println("5. Avisos de Servicios");
            System.out.println("6. Generar Reporte Semanal");
            System.out.println("7. Salir");
            System.out.println("===============================================");
            System.out.print("Seleccione una opción: ");

            int opcion = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer del scanner
                    if (opcion >= 1 && opcion <= 7) {
                        entradaValida = true;
                    } else {
                        System.out.println("Opción no válida. Debe ingresar un número entre 1 y 7.");
                        System.out.print("Seleccione una opción: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Debe ingresar un número entero.");
                    scanner.next();  // Limpiar el buffer de entrada
                    System.out.print("Seleccione una opción: ");
                }
            }

            switch (opcion) {
                case 1:
                    Utilidades.limpiarPantalla();
                    MenuBeneficiarios.mostrarMenu(scanner);
                    break;
                case 2:
                    Utilidades.limpiarPantalla();
                    MenuServicios.mostrarMenu(scanner);
                    break;
                case 3:
                    // Llamar al método para el seguimiento de impacto
                    break;
                case 4:
                    // Llamar al método para la gestión de múltiples beneficiarios
                    break;
                case 5:
                    // Llamar al método para avisos de servicios
                    break;
                case 6:
                    // Llamar al método para generar reportes semanales
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

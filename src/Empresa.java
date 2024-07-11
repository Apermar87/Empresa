import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String cliente, descripcion;
        double importe;
        Factura factura;

        System.out.println("Introduzca el nombre del cliente: ");
        cliente = scanner.nextLine();

        System.out.println("Introduzca la descripción: ");
        descripcion = scanner.nextLine();

        System.out.println("Introduzca el importe ");
        importe = scanner.nextDouble();

        factura = new Factura(cliente, descripcion, importe);
        factura.imprimirPresupuesto();
    }
}

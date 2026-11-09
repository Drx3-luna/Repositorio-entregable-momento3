import java.util.Scanner;

public class Entregable_momento3_DSGL {

    public static void main(String[] args) {
        String[] referencias = {"Chaqueta Cuero Icon", "Jean Slim Fit", "Camiseta Polo Leather", null, null};
        Scanner leer = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n CHEVIGNON ");
            System.out.println("1. Listar referencias");
            System.out.println("2. Buscar referencia");
            System.out.println("3. Agregar referencia");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    for (int i = 0; i < referencias.length; i++) {
                        if (referencias[i] != null) {
                            System.out.println("- " + referencias[i]);
                        }
                    }
                    break;
                case "2":
                    System.out.print("Prenda a buscar: ");
                    String buscada = leer.nextLine();
                    if (nombreFuncion(referencias, buscada)) {
                        System.out.println("Existe.");
                    } else {
                        System.out.println("No existe.");
                    }
                    break;
                case "3":
                    System.out.print("Nueva prenda: ");
                    String nueva = leer.nextLine();
                    boolean guardada = false;
                    for (int i = 0; i < referencias.length && !guardada; i++) {
                        if (referencias[i] == null) {
                            referencias[i] = nueva;
                            guardada = true;
                        }
                    }
                    if (guardada) {
                        System.out.println("Guardada.");
                    } else {
                        System.out.println("Inventario lleno.");
                    }
                    break;
                case "4":
                    System.out.println("Saliendo del sistema ...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!opcion.equals("4"));

        leer.close();
    }

    static boolean nombreFuncion(String[] arreglo, String nombreBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].equals(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }
}

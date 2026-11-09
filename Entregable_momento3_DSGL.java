import java.util.Scanner;

public class Entregable_momento3_DSGL {

    public static void main(String[] args) {
        String[] referencias = {"Chaqueta Cuero Icon", "Jean Slim Fit", "Camiseta Polo Leather", null, null};
        Scanner leer = new Scanner(System.in);
        String opcion;

        
            System.out.println("\n CHEVIGNON ");
            System.out.println("1. Listar referencias");
            System.out.println("2. Buscar referencia");
            System.out.println("3. Agregar referencia");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = leer.nextLine();

            

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

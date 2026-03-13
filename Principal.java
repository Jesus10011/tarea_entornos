import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        mostrarFecha();
        Usuario[] arrayUsuarios = crearArrayUsuarios(3);
        for (int i = 0; i < arrayUsuarios.length; i++) {
            System.out.println("Nombre: " + arrayUsuarios[i].getNombre());
            System.out.println("Apellidos: " + arrayUsuarios[i].getApellidos());
            System.out.println("Email: " + arrayUsuarios[i].getEmail());
        }
    }

    public static void mostrarFecha() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }

    public static Usuario[] crearArrayUsuarios(int cantidad) {
        Usuario[] arr = new Usuario[cantidad];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Escribe el nombre del usuario " + (i+1) + ": ");
            String nombre = teclado.nextLine();
            System.out.print("Escribe los apellidos del usuario " + (i+1) + ": ");
            String apellidos = teclado.nextLine();
            System.out.print("Escribe el email del usuario " + (i+1) + ": ");
            String email = teclado.nextLine();

            Usuario nuevoUsuario = new Usuario(nombre, apellidos, email);
            arr[i] = nuevoUsuario;
        }
        return arr;
    }
}
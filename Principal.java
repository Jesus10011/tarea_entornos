import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        mostrarFecha();
    }

    public static void mostrarFecha() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }
}
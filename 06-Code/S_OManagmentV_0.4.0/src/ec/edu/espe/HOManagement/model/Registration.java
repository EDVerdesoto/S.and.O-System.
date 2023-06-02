package ec.edu.espe.HOManagement.model;
import java.util.Scanner;
/**
 *
 * @author Code Warriors, DCCO-ESPE
 */

public class Registration {
    private static final String username = "username";
    private static final String password = "password";

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        boolean loginSuccessful = false;

        do {
            System.out.print("Nombre de usuario: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Contraseña: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
                loginSuccessful = true;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Inténtalo nuevamente.");
            }
        } while (!loginSuccessful);
    }
}
  

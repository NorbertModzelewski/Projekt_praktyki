import java.util.Scanner;
public class Klienci {
    private String email;
    private String haslo;

    public void setEmail(String newEmail) {

        this.email = newEmail;
    }

    public void setHaslo(String newHaslo) {
        this.haslo = newHaslo;
    }


    public static void logowanie() {
        Klienci myObj = new Klienci();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź email");
        myObj.setEmail(scanner.next());

        System.out.println("Wprowadź haslo:");
        myObj.setHaslo(scanner.next());
        System.out.println("Pomyślnie zalogowano użytkownika "+myObj.email);
    }
}

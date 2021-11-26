import java.util.Scanner;
public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String adres;
    private int kod_pocztowy;


    public Person(String imie, String nazwisko, int wiek, String adres, int kod_pocztowy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
        this.kod_pocztowy = kod_pocztowy;
    }

    public static void log() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane:");
        System.out.println("Wprowadź imie:");
        String imie = scanner.next();
        System.out.println("Wprowadź nazwisko:");
        String nazwisko = scanner.next();
        System.out.println("Wprowadź wiek:");
        int wiek = scanner.nextInt();
        System.out.println("Wprowadź adres:");
        String adres = scanner.next();
        System.out.println("Wprowadź kod pocztowy:");
        int kod_pocztowy = scanner.nextInt();
        new Person(imie,nazwisko,wiek,adres,kod_pocztowy);
    }
}




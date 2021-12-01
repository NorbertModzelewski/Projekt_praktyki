import java.util.Scanner;

public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String haslo;


    public void setImie(String newImie) {
        this.imie = newImie;
    }

    public void setNazwisko(String newNazwisko) {
        this.nazwisko = newNazwisko;
    }

    public void setWiek(int newWiek){
        this.wiek = newWiek;
    }

    public void setHaslo(String newHaslo){
        this.haslo = newHaslo;
    }

    public static void rejestracja() {
        Person myObj = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź imie");
        myObj.setImie(scanner.next());
        System.out.println("Twoj imie: "+ myObj.imie);

        System.out.println("Wprowadź nazwisko");
        myObj.setNazwisko(scanner.next());
        System.out.println("Twoje nazwisko: "+ myObj.nazwisko);

        System.out.println("Wprowadź wiek:");
        myObj.setWiek(scanner.nextInt());
        System.out.println("Twoje wiek: "+ myObj.wiek);

        System.out.println("Wprowadź hasło:");
        myObj.setHaslo(scanner.next());
        System.out.println("Witamy "+myObj.imie+"!");



    }
}




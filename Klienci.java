public class Klienci {
   public static String adres;
   public static int kod_pocztowy;
    public static String imie;
    public static String nazwisko;
    public static int wiek;

    public Klienci(String imie, String nazwisko, int wiek, String adres, int kod_pocztowy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
        this.kod_pocztowy = kod_pocztowy;
    }
}
/**
Konstruktor klienta do , którego odwołuje się klasa Main


 @autorzy
 Norbert Modzeleski, Dominik Krucha
 **/
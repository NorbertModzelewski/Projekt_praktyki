public class Klienci extends Person{
    public String email;
    public String haslo;

    public Klienci(String imie, String nazwisko, int wiek, String adres, int kod_pocztowy, String email, String haslo) {
        super(imie, nazwisko, wiek, adres, kod_pocztowy);
        this.email = email;
        this.haslo = haslo;
    }
}

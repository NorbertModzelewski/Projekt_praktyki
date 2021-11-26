public class admini extends Person {
    private int nr_identfikatoru;
    private char kontakt;

    public admini(String imie, String nazwisko, int wiek, String adres, int kod_pocztowy, int nr_identfikatoru, char kontakt) {
        super(imie, nazwisko, wiek, adres, kod_pocztowy);
        this.nr_identfikatoru = nr_identfikatoru;
        this.kontakt = kontakt;
    }
}

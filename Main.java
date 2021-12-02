import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Logowanie");
        System.out.println("1. Zaloguj się");
        System.out.println("2. Zarejstuj się");
        login();
    }

    /**
     * Funkcja umożliwiająca logowanie lub rejestracje przez wybór opcji
     * Funkcja try catch wyłapuje błąd przy braku wyboru i powtarza program aż do wyboru
     * param int
     *
     * @autorzy Norbert Modzeleski, Dominik Krucha
     **/
    public static void login() {

        Scanner scanner = new Scanner(System.in);
        try {
            int wybierz = scanner.nextInt();
            switch (wybierz) {
                case 1:
                    Klienci.logowanie();
                    strona_glowna();
                    break;

                case 2:
                    Person.rejestracja();
                    strona_glowna();
                    break;
                default:
                    System.out.println("Wybierz liczbe z przedziału od 1 do 2!");
                    login();

            }
        } catch (InputMismatchException e) {
            System.out.println("Wprowadziłeś zły znak");
            System.out.println("Logowanie");
            System.out.println("1. Zaloguj się");
            System.out.println("2. Zarejstuj się");
            login();
        }
    }

    /**
     * Metoda umożliwiająca wybór opcji zakupu lub sprawdzenia trwających promocji itp.
     *
     * @autorzy Norbert Modzelewski, Dominik Krucha
     */
    public static void strona_glowna() {
        int opcje;
        int wyjdz = 0;
        while (wyjdz == 0) {
            try {


                Scanner scanner = new Scanner(System.in);
                System.out.println("Witamy w naszym sklepie gamingowym Gaming Room!");
                System.out.println("1. Promocje");
                System.out.println("2. Sprzedaż ");
                System.out.println("3. Black Friday");
                System.out.println("4. Rekomendowane produkty");
                System.out.println("5. Przejście do koszyka");
                System.out.println("6. Wyjście ze strony");
                opcje = scanner.nextInt();
                switch (opcje) {
                    case 1:
                        promocje();
                        break;
                    case 2:
                        sprzedaz();
                        break;
                    case 3:
                        black_friday();
                        break;
                    case 4:
                        rekomendowane_produkty();
                        break;

                    case 5:
                        wyjdz=1;
                        Koszyk.koszyk();
                        break;

                    case 6:
                        System.out.println("Do zobaczenia.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wybierz liczbe z przedziału od 1 do 6!");
                        strona_glowna();

                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś zły znak!");
                strona_glowna();
            }
        }

    }

    /**
     * Funkcja informująca użytkownika o aktualnych przecenach w sklepie
     * @autorzy Norbert Modzelewski, Dominik Krucha
     */



    public static void promocje(){

        System.out.println("Promocje do -70%");
        System.out.println("Promocje sprzetu komputerowego 30%");
        System.out.println("Promocje krzeseł i biurek 40%");
        System.out.println("Promocje świateł led 10%(GAMING)");
        strona_glowna();
    }

    /**
     * Funkcja umożliwiająca wybór kategori  przedmiotu który chce sie kupić
     * @autorzy Norbert Modzelewski, Dominik Krucha
     */




    public static void sprzedaz(){

        int opcje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sprzedaż komputerów");
        System.out.println("2. Sprzedaż myszek");
        System.out.println("3. Sprzedaż klawiatur");
        System.out.println("4. Sprzedaż podstawek");
        System.out.println("5. Sprzedaż monitorów");
        System.out.println("6. Sprzedaż PaySafeCard");
        System.out.println("7. Sprzedaż krzeseł");
        System.out.println("8. Sprzedaż biurek");
        System.out.println("9. wyjscie do strony głownej");
        opcje = scanner.nextInt();
        try{


            switch(opcje) {
                case 1:
                    System.out.println("Komputery");
                    System.out.println("Wybierz komputer który chcesz kupić 1.Ultra Gaming 2.Ultra Gaming Master 3.Champion");
                    opcje = scanner.nextInt();

                    switch (opcje) {
                        case 1:
                            System.out.println("Ultra Gaming");
                            System.out.println("Dodałeś do koszyka komputer Ultra Gaming.");
                            Koszyk.koszyk.add("Komputer ultra gaming");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("Ultra Gaming Master");
                            System.out.println("Dodałeś do koszyka komputer Ultra Gaming Master.");
                            Koszyk.koszyk.add("Komputer Ultra Gaming Master");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("Champion");
                            System.out.println("Dodałeś do koszyka komputer Champion.");
                            Koszyk.koszyk.add("Komputer komputer Champion");
                            sprzedaz();

                            break;

                    }

                case 2:
                    System.out.println("Myszki");
                    System.out.println("Wybierz która myszke chcesz kupić 1.Razer Viper 2.Endgame Gear XM1 3.Corsair Sabre RGB Pro");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Razer Viper");
                            System.out.println("Dodałeś do koszyka myszke Razer Viper.");
                            Koszyk.koszyk.add("Myszka Razer Viper");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("Endgame Gear XM1");
                            System.out.println("Dodałeś do koszyka myszke Endgame Gear XM1.");
                            Koszyk.koszyk.add("Myszka Endgame Gear XM1");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("Corsair Sabre RGB Pro");
                            System.out.println("Dodałeś do koszyka myszke Corsair Sabre RGB Pro.");
                            Koszyk.koszyk.add("myszka Corsair Sabre RGB Pro");
                            sprzedaz();

                            break;

                    }
                case 3:
                    System.out.println("Klawiatury");
                    System.out.println("Wybierz klawiature która chcesz kupić 1.Asus ROG Strix Scope 2.Cherry G80-3000 3.Corsair Gaming K95 RGB");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Asus ROG Strix Scope");
                            System.out.println("Dodałeś do koszyka klawiature Asus ROG Strix Scope.");
                            Koszyk.koszyk.add("klawiatura Asus ROG Strix Scope");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("Cherry G80-3000");
                            System.out.println("Dodałeś do koszyka klawiature Cherry G80-3000.");
                            Koszyk.koszyk.add("klawiatura Cherry G80-3000");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("Corsair Gaming K95 RGB");
                            System.out.println("Dodałeś do koszyka klawiature Corsair Gaming K95 RGB.");
                            Koszyk.koszyk.add("klawiatura Corsair Gaming K95 RGB");
                            sprzedaz();

                            break;

                    }
                case 4:
                    System.out.println("Podstawki do myszek");
                    System.out.println("Wybierz podstawke do myszek która chcesz kupić 1.X 2.Y 3.Z");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("X");
                            System.out.println("Dodałeś do koszyka podstawke X.");
                            Koszyk.koszyk.add("Podstwaka X");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("Y");
                            System.out.println("Dodałeś do koszyka podstwke Y.");
                            Koszyk.koszyk.add("Podstwaka Y");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("Z");
                            System.out.println("Dodałeś do koszyka podstawke Z.");
                            Koszyk.koszyk.add("Podstwaka Z");
                            sprzedaz();

                            break;

                    }
                case 5:
                    System.out.println("Monitory gamingowe");
                    System.out.println("Wybierz monitor który chciałbyś kupić 1.ASUS VG248QG 2.Iiyama ProLite XUB2796QSU-B1 3. ");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("ASUS VG248QG");
                            System.out.println("Dodałeś do koszyka monitor ASUS VG248QG.");
                            Koszyk.koszyk.add("Monitor ASUS VG248QG");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("Iiyama ProLite XUB2796QSU-B1");
                            System.out.println("Dodałeś do koszyka monitor Iiyama ProLite XUB2796QSU-B1.");
                            Koszyk.koszyk.add("Monitor Iiyama ProLite XUB2796QSU-B1");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("LG 27GN880 Ergo ");
                            System.out.println("Dodałeś do koszyka monitor LG 27GN880 Ergo.");
                            Koszyk.koszyk.add("Monitor LG 27GN880 Ergo");
                            sprzedaz();

                            break;

                    }
                case 6:
                    System.out.println("Doładowania PaySafeCard");
                    System.out.println("Wybierz doładowanie PSC które chcesz kupić 1.20zł 2.50zł 3.100zł");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("PSC 20zł");
                            System.out.println("Dodałeś do koszyka PSC za 20zł.");
                            Koszyk.koszyk.add("PSC 20 zł");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("PSC 50zł");
                            System.out.println("Dodałeś do koszyka PSC za 50zł.");
                            Koszyk.koszyk.add("PSC 50 zł");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("PSC 100zł");
                            System.out.println("Dodałeś do koszyka PSC za 100zł.");
                            Koszyk.koszyk.add("PSC 100 zł");
                            sprzedaz();

                            break;

                    }
                case 7:
                    System.out.println("Krzesła");
                    System.out.println("Wybierz krzesło które chcesz kupić 1.Diablo Chairs X-ONE 2.MAD DOG GCH700 3.Kraken ");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Diablo Chairs X-ONE");
                            System.out.println("Dodałeś do koszyka krzesło Diablo Chairs X-ONE.");
                            Koszyk.koszyk.add("Krzesło Diablo Chairs X-ONE");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("MAD DOG GCH700");
                            System.out.println("Dodałeś do koszyka krzesło MAD DOG GCH700.");
                            Koszyk.koszyk.add("Krzesło MAD DOG GCH700");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("Kraken");
                            System.out.println("Dodałeś do koszyka krzesło Kraken.");
                            Koszyk.koszyk.add("Krzesło Kraken");
                            sprzedaz();

                            break;

                    }
                case 8:
                    System.out.println("Biurka gamingowe");
                    System.out.println("Wybierz biurko które chcesz kupić 1.Ultradesk SPACE XXL 2.‎Silver Monkey 3.Huzaro Hero 5.0 White");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Ultradesk SPACE XXL");
                            System.out.println("Dodałeś do koszyka biurko Ultradesk SPACE XXL.");
                            Koszyk.koszyk.add("Biurko Ultradesk SPACE XXL");
                            sprzedaz();

                            break;
                        case 2:
                            System.out.println("‎Silver Monkey");
                            System.out.println("Dodałeś do koszyka biurko ‎Silver Monkey.");
                            Koszyk.koszyk.add("Biurko ‎Silver Monkey");
                            sprzedaz();

                            break;
                        case 3:
                            System.out.println("Huzaro Hero 5.0 White");
                            System.out.println("Dodałeś do koszyka biurko Huzaro Hero 5.0 White.");
                            Koszyk.koszyk.add("Biurko Huzaro Hero 5.0 White");
                            sprzedaz();

                            break;

                    }
                case 9:
                    strona_glowna();

                    break;


                default:
                    System.out.println("wybierz liczbe z przedziału od 1 do 9");
                    sprzedaz();
            }

        }catch(InputMismatchException e){
            System.out.println("Wprowadziłeś zły znak ");
            sprzedaz();
        }


    }


    /**
     * Wyświetla informacje o czarnym piątku
     * @autorzy Norbert Modzelewski, Dominik Krucha
     */
    public static void black_friday(){
        System.out.println("W piatek 26.11.2021 będa promocje na większość przedmiotów w naszym sklepie");
        strona_glowna();
    }


    /**
     * Funkcja pokazująca rekomendowane produkty i umożliwiająca zakup sprzętu komputerowego
     * @autorzy Norbert Modzelewski, Dominik Krucha
     */
    public static void rekomendowane_produkty() {
        int opcje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rekomendowane produkty w naszym sklepie.");
        System.out.println("1.Myszki\n 2.Komputery\n 3.Krzesła\n 4.Powrót do strony głównej");
        opcje = scanner.nextInt();
        try {
            switch (opcje) {
                case 1:
                    System.out.println("Myszki");
                    System.out.println("Wybierz myszke która chcesz kupić 1.Myszka Genesis 2.Myszka SteelSeries 3.Myszka Logitech");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Myszka Genesis Krypton110");
                            System.out.println("Dodałeś do koszyka myszke Genesis.");
                            Koszyk.koszyk.add("Myszka Genesis");
                            rekomendowane_produkty();

                            break;
                        case 2:
                            System.out.println("Myszka SteelSeries Rival 3");
                            System.out.println("Dodałeś do koszyka myszke SteelSeries.");
                            Koszyk.koszyk.add("Myszka SteelSeries");
                            rekomendowane_produkty();

                            break;
                        case 3:
                            System.out.println("Myszka Logitech G502");
                            System.out.println("Dodałeś do koszyka myszke Myszka Logitech");
                            Koszyk.koszyk.add("Myszka Logitech");
                            rekomendowane_produkty();

                            break;

                    }

                case 2:
                    System.out.println("Komputery");
                    System.out.println("Wybierz komputer który chcesz kupić 1.Asus 2.Lenovo 3.Dell");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Komputer ASUS");
                            System.out.println("Dodałeś do koszyka komputer ASUS.");
                            Koszyk.koszyk.add("Komputer Asus");
                            rekomendowane_produkty();

                            break;
                        case 2:
                            System.out.println("Komputer Lenovo");
                            System.out.println("Dodałeś do koszyka komputer Lenovo.");
                            Koszyk.koszyk.add("Komputer Lenovo");
                            rekomendowane_produkty();

                            break;
                        case 3:
                            System.out.println("Komputer Dell.");
                            System.out.println("Dodałeś do koszyka komputer Dell.");
                            Koszyk.koszyk.add("Komputer Dell");
                            rekomendowane_produkty();

                            break;

                    }
                case 3:
                    System.out.println("Krzesła");
                    System.out.println("Wybierz krzesło które chcesz kupić 1.Diablo 2.Gamvis 3.Huzaro");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Krzesło Diablo");
                            System.out.println("Dodałeś do koszyka krzesło Diablo.");
                            Koszyk.koszyk.add("Krzesło Diablo");
                            rekomendowane_produkty();

                            break;
                        case 2:
                            System.out.println("Krzesło Gamvis");
                            System.out.println("Dodałeś do koszyka krzesło Gamvis.");
                            Koszyk.koszyk.add("Krzesło Gamvis");
                            rekomendowane_produkty();

                            break;
                        case 3:
                            System.out.println("Krzesło Huzaro.");
                            System.out.println("Dodałeś do koszyka krzesło Huzaro.");
                            Koszyk.koszyk.add("Krzesło Huzaro");
                            rekomendowane_produkty();

                            break;

                    }
                case 4:
                    strona_glowna();
                    break;
                default:
                    System.out.println("Wybierz liczbe z przedziału od 1 do 4!");
                    rekomendowane_produkty();
            }
        }catch (InputMismatchException e){
            System.out.println("Wprowadziłeś zły znak!");
            rekomendowane_produkty();
        }


    }
}

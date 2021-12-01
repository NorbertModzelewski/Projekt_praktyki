import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int wybierz;
        System.out.println("Logowanie");
        System.out.println("1. Zaloguj się");
        System.out.println("2. Zarejstuj się");
        login();
        strona_glowna();
    }

    public static void login() {

        Scanner scanner = new Scanner(System.in);
        try {
            int wybierz = scanner.nextInt();
            switch (wybierz) {
                case 1:
                    Klienci.logowanie();
                    break;

                case 2:
                    Person.rejestracja();
                    break;
                default:
                    System.out.println("Wybierz liczbe z przedziału od 1 do 2!");
                    login();

            }
        }catch(InputMismatchException e){
            System.out.println("Wprowadziłeś zły znak");
            System.out.println("Logowanie");
            System.out.println("1. Zaloguj się");
            System.out.println("2. Zarejstuj się");
            login();
        }
    }
    public static void strona_glowna(){
        int opcje;
        try{


        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w naszym sklepie gamingowym Gaming Room");
        System.out.println("1. Promocje");
        System.out.println("2. Sprzedaż ");
        System.out.println("3. Black Friday");
        System.out.println("4. Rekomendowane produkty");
        System.out.println("5. Wyjście ze strony");
        opcje = scanner.nextInt();
        switch(opcje){
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
                break;
            default:
                System.out.println("Wybierz liczbe z przedziału od 1 do 5!");
                strona_glowna();
        }
        }catch (InputMismatchException e){
            System.out.println("Wprowadziłeś zły znak!");
            strona_glowna();
        }
    }
    public static void promocje(){

        System.out.println("Promocje do -70%");
        System.out.println("Promocje sprzetu komputerowego");
        System.out.println("Promocje krzeseł i biurek");
        System.out.println("Promocje świateł led");
        strona_glowna();
    }
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
        opcje = scanner.nextInt();
        try{


        switch(opcje){
            case 1:
                System.out.println("Komputery");
                System.out.println("Wybierz komputer który chcesz kupić 1.Ultra Gaming 2.Ultra Gaming Master 3.Champion");
                opcje = scanner.nextInt();

                switch(opcje){
                    case 1:
                        System.out.println("Ultra Gaming");
                        System.out.println("Kupiłeś komputer Ultra Gaming.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("Ultra Gaming Master");
                        System.out.println("Kupiłeś komputer Ultra Gaming Master.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("Champion");
                        System.out.println("Kupiłeś komputer Champion.");
                        sprzedaz();
                        break;

                }

            case 2:
                System.out.println("Myszki");
                System.out.println("Wybierz która myszke chcesz kupić 1.Razer Viper 2.Endgame Gear XM1 3.Corsair Sabre RGB Pro");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("Razer Viper");
                        System.out.println("Kupiłeś myszke Razer Viper.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("Endgame Gear XM1");
                        System.out.println("Kupiłeś myszke Endgame Gear XM1.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("Corsair Sabre RGB Pro");
                        System.out.println("Kupiłeś myszke Corsair Sabre RGB Pro.");
                        sprzedaz();
                        break;

                }
            case 3:
                System.out.println("Klawiatury");
                System.out.println("Wybierz klawiature która chcesz kupić 1.Asus ROG Strix Scope 2.Cherry G80-3000 3.Corsair Gaming K95 RGB");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("Asus ROG Strix Scope");
                        System.out.println("Kupiłeś klawiature Asus ROG Strix Scope.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("Cherry G80-3000");
                        System.out.println("Kupiłeś klawiature Cherry G80-3000.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("Corsair Gaming K95 RGB");
                        System.out.println("Kupiłeś klawiature Corsair Gaming K95 RGB.");
                        sprzedaz();
                        break;

                }
            case 4:
                System.out.println("Podstawki do myszek");
                System.out.println("Wybierz podstawke do myszek która chcesz kupić 1.X 2.Y 3.Z");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("X");
                        System.out.println("Kupiłeś podstawke X.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("Y");
                        System.out.println("Kupiłeś podstwke Y.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("Z");
                        System.out.println("Kupiłeś podstawke Z.");
                        sprzedaz();
                        break;

                }
            case 5:
                System.out.println("Monitory gamingowe");
                System.out.println("Wybierz monitor który chciałbyś kupić 1.ASUS VG248QG 2.Iiyama ProLite XUB2796QSU-B1 3. ");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("ASUS VG248QG");
                        System.out.println("Kupiłeś monitor ASUS VG248QG.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("Iiyama ProLite XUB2796QSU-B1");
                        System.out.println("Kupiłeś monitor Iiyama ProLite XUB2796QSU-B1.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("LG 27GN880 Ergo ");
                        System.out.println("Kupiłeś monitor LG 27GN880 Ergo.");
                        sprzedaz();
                        break;

                }
            case 6:
                System.out.println("Doładowania PaySafeCard");
                System.out.println("Wybierz doładowanie PSC które chcesz kupić 1.20zł 2.50zł 3.100zł");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("PSC 20zł");
                        System.out.println("Kupiłeś PSC za 20zł.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("PSC 50zł");
                        System.out.println("Kupiłeś PSC za 50zł.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("PSC 100zł");
                        System.out.println("Kupiłeś PSC za 100zł.");
                        sprzedaz();
                        break;

                }
            case 7:
                System.out.println("Krzesła");
                System.out.println("Wybierz krzesło które chcesz kupić 1.Diablo Chairs X-ONE 2.MAD DOG GCH700 3.Kraken ");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("Diablo Chairs X-ONE");
                        System.out.println("Kupiłeś krzesło Diablo Chairs X-ONE.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("MAD DOG GCH700");
                        System.out.println("Kupiłeś krzesło MAD DOG GCH700.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("Kraken");
                        System.out.println("Kupiłeś krzesło Kraken.");
                        sprzedaz();
                        break;

                }
            case 8:
                System.out.println("Biurka gamingowe");
                System.out.println("Wybierz biurko które chcesz kupić 1.Ultradesk SPACE XXL 2.‎Silver Monkey 3.Huzaro Hero 5.0 White");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("Ultradesk SPACE XXL");
                        System.out.println("Kupiłeś biurko Ultradesk SPACE XXL.");
                        sprzedaz();
                        break;
                    case 2:
                        System.out.println("‎Silver Monkey");
                        System.out.println("Kupiłeś biurko ‎Silver Monkey.");
                        sprzedaz();
                        break;
                    case 3:
                        System.out.println("Huzaro Hero 5.0 White");
                        System.out.println("Kupiłeś biurko Huzaro Hero 5.0 White.");
                        sprzedaz();
                        break;

                }
            default:
                System.out.println("wybierz liczbe z przedziału od 1 do 8");
                sprzedaz();
        }
        }catch(InputMismatchException e){
            System.out.println("Wprowadziłeś zły znak ");
            sprzedaz();
        }


    }
    public static void black_friday(){
        System.out.println("W piatek 26.11.2021 będa promocje na większość przedmiotów w naszym sklepie");
        strona_glowna();
    }
    public static void rekomendowane_produkty() {
        int opcje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rekomendowane produkty w naszym sklepie.");
        System.out.println("1.Myszki 2.Komputery 3.Krzesła");
        opcje = scanner.nextInt();
        try {
            switch (opcje) {
                case 1:
                    System.out.println("Myszki");
                    System.out.println("Wybierz myszke która chcesz kupić 1.Myszka Genesis 2.Myszka SteelSeries 3.Myszka Logitech");
                    opcje = scanner.nextInt();
                    switch (opcje) {
                        case 1:
                            System.out.println("Myszka Genesis");
                            System.out.println("Kupiłeś myszke Genesis.");
                            rekomendowane_produkty();
                            break;
                        case 2:
                            System.out.println("Myszka SteelSeries");
                            System.out.println("Kupiłeś myszke SteelSeries.");
                            rekomendowane_produkty();
                            break;
                        case 3:
                            System.out.println("Myszka Logitech");
                            System.out.println("Kupiłeś myszke Myszka Logitech");
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
                            System.out.println("Kupiłeś komputer ASUS.");
                            rekomendowane_produkty();
                            break;
                        case 2:
                            System.out.println("Komputer Lenovo");
                            System.out.println("Kupiłeś komputer Lenovo.");
                            rekomendowane_produkty();
                            break;
                        case 3:
                            System.out.println("Komputer Dell.");
                            System.out.println("Kupiłeś komputer Dell.");
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
                            System.out.println("Kupiłeś krzesło Diablo.");
                            rekomendowane_produkty();
                            break;
                        case 2:
                            System.out.println("Krzesło Gamvis");
                            System.out.println("Kupiłeś krzesło Gamvis.");
                            rekomendowane_produkty();
                            break;
                        case 3:
                            System.out.println("Krzesło Huzaro.");
                            System.out.println("Kupiłeś krzesło Huzaro.");
                            rekomendowane_produkty();
                            break;

                    }
                default:
                    System.out.println("Wybierz liczbe z przedziału od 1 do 3!");
                    rekomendowane_produkty();
            }
        }catch (InputMismatchException e){
            System.out.println("Wprowadziłeś zły znak!");
            rekomendowane_produkty();
        }
            rekomendowane_produkty();

    }

}


/**
 *Funkcja strona glowna : Umożliwia wybranienie kategorii w naszym sklepie.
 *Funkcja promocje : Informuje klienta na jakie przedmioty i ile zniżki jest na promocji.
 *Funkcja sprzedaz : Umożliwia zakupu wybranego przedmiotu przez klienta przy odpowoedniej ilosci pieniedzy doładowaniu konta.
 *Funkcja black_friday : Informuje klienta o promocji tak zwanej w czarny piątek odbywającej się w dniu 26.11.2021 na większość
 przedmiotów w sklepie.
 *Funkcja rekomendowane_produkty : Wyświetla polecane produkty klientom.
 * @autorzy
 *Norbert Modzeleski, Dominik Krucha
 **/

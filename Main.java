import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Klienci.logowanie();
        strona_glowna();
    }

    public static void strona_glowna(){
        int opcje;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w sklepie gamingowym");
        System.out.println("1. Promocje");
        System.out.println("2. Sprzedaż ");
        System.out.println("3. Black Friday");
        System.out.println("4. Rekomendowane produkty");
        System.out.println("5. Wyjście ze strony");
        opcje = scanner.nextInt();
        switch(opcje){
            case 1:
                promocje();
            case 2:
                sprzedaz();
            case 3:
                black_friday();
            case 4:
                rekomendowane_produkty();
            case 5:
                break;
            }
        }
    public static void promocje(){
        System.out.println("Promocje do -70%");
        System.out.println("Promocje sprzetu komputerowego");
        System.out.println("Promocje krzeseł i biurek");
        System.out.println("promocje ledów");
        strona_glowna();
    }
    public static void sprzedaz(){
        int opcje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sprzedaż komputerów: opcja 1");
        System.out.println("Sprzedaż osprzetu komputerowego: opcja 2,3,4,5");
        System.out.println("Sprzedaż psc: opcja 6");
        System.out.println("Produkty krzesła, przedaż umeblowania gamingowego: opcja 7,8");
        opcje = scanner.nextInt();
        switch(opcje){
            case 1:
                System.out.println("Komputery");
                System.out.println("Wybierz komputer który chcesz kupić 1.Ultra Gaming 2.Ultra Gaming Master 3.Champion");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("Ultra Gaming");
                        System.out.println("Kupiłeś komputer Ultra Gaming.");
                        strona_glowna();

                    case 2:
                        System.out.println("Ultra Gaming Master");
                        System.out.println("Kupiłeś komputer Ultra Gaming Master.");
                        strona_glowna();
                    case 3:
                        System.out.println("Champion");
                        System.out.println("Kupiłeś komputer Champion.");
                        strona_glowna();

                }

            case 2:
                System.out.println("myszki");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("myszka1");
                        System.out.println("kupiles myszke1");
                        strona_glowna();
                    case 2:
                        System.out.println("myszka2");
                        System.out.println("kupiles myszke2");
                        strona_glowna();
                    case 3:
                        System.out.println("myszka3");
                        System.out.println("kupiles myszke3");
                        strona_glowna();

                }
            case 3:
                System.out.println("klawiatury");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("klawiatura1");
                        System.out.println("kupiles klawiature1");
                        strona_glowna();
                    case 2:
                        System.out.println("klawiatura2");
                        System.out.println("kupiles klawiature2");
                        strona_glowna();
                    case 3:
                        System.out.println("klawiatura3");
                        System.out.println("kupiles klawiature3");
                        strona_glowna();

                }
            case 4:
                System.out.println("podstawki");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("podstawka1");
                        System.out.println("kupiles podstwke1");
                        strona_glowna();
                    case 2:
                        System.out.println("podstwaka2");
                        System.out.println("kupiles podstwke2");
                        strona_glowna();
                    case 3:
                        System.out.println("podstawka3");
                        System.out.println("kupiles podstwke3");
                        strona_glowna();

                }
            case 5:
                System.out.println("monitory");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("monitor1");
                        System.out.println("kupiles monitor1");
                        strona_glowna();
                    case 2:
                        System.out.println("monitor2");
                        System.out.println("kupiles monitor2");
                        strona_glowna();
                    case 3:
                        System.out.println("monitor3");
                        System.out.println("kupiles monitor3");
                        strona_glowna();

                }
            case 6:
                System.out.println("doładowania");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("doładowanie1");
                        System.out.println("kupiles doładowanie1");
                        strona_glowna();
                    case 2:
                        System.out.println("doładowanie2");
                        System.out.println("kupiles doładowanie2");
                        strona_glowna();
                    case 3:
                        System.out.println("doładowanie3");
                        System.out.println("kupiles doładowanie3");
                        strona_glowna();

                }
            case 7:
                System.out.println("Krzesła");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("krzesło1");
                        System.out.println("kupiles krzeslo1");
                        strona_glowna();
                    case 2:
                        System.out.println("krzesło2");
                        System.out.println("kupiles krzeslo2");
                        strona_glowna();
                    case 3:
                        System.out.println("krzesło3");
                        System.out.println("kupiles krzeslo3");
                        strona_glowna();

                }
            case 8:
                System.out.println("biurka");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("biurko1");
                        System.out.println("kupiles biurko1");
                        strona_glowna();
                    case 2:
                        System.out.println("biurko2");
                        System.out.println("kupiles biurko2");
                        strona_glowna();
                    case 3:
                        System.out.println("biurko3");
                        System.out.println("kupiles biurko3");
                        strona_glowna();

                }
        }
        strona_glowna();

    }
    public static void black_friday(){
        System.out.println("W piatek 26.11.2021 będa promocje na większość przedmiotów w naszym sklepie");
        strona_glowna();
    }
    public static void rekomendowane_produkty(){
        int opcje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Najbardziej rekomendowanwe produkty w naszym sklepie");
        System.out.println("wybierz opcje 1,2 lub 3");
        opcje = scanner.nextInt();
        switch(opcje){
            case 1:
                System.out.println("myszki");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("myszka genesis");
                        System.out.println("kupiles myszke genesis");
                        strona_glowna();
                    case 2:
                        System.out.println("myszka steelseries");
                        System.out.println("kupiles myszke steelseries");
                        strona_glowna();
                    case 3:
                        System.out.println("myszka logitech");
                        System.out.println("kupiles myszke logitech");
                        strona_glowna();

                }

            case 2:
                System.out.println("komputery");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("komputer asus");
                        System.out.println("kupiles komputer asus");
                        strona_glowna();
                    case 2:
                        System.out.println("komputer lenovo");
                        System.out.println("kupiles komputer lenovo");
                        strona_glowna();
                    case 3:
                        System.out.println("komputer dell");
                        System.out.println("kupiles komputer dell");
                        strona_glowna();

                }
            case 3:
                System.out.println("krzesła");
                System.out.println("wybierz opcje 1,2 lub 3");
                opcje = scanner.nextInt();
                switch(opcje){
                    case 1:
                        System.out.println("krzesło diablo");
                        System.out.println("kupiles krzesło diablo");
                        strona_glowna();
                    case 2:
                        System.out.println("krzesło gamvis");
                        System.out.println("kupiles krzesło gamvis");
                        strona_glowna();
                    case 3:
                        System.out.println("krzesło huzaro");
                        System.out.println("kupiles krzesło huzaro");
                        strona_glowna();

                }
        }
        strona_glowna();
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

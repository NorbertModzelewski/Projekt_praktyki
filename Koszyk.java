import java.util.ArrayList;


public class Koszyk {

    public static ArrayList<String> koszyk = new ArrayList<>();

    /**
     * Metoda dodająca przedmioty do koszyka i pokazywanie produktów które zostały dodane
     *
     * @authorzy Norbert Modzelewski, Dominik Krucha
     */

    public static void koszyk() {
        if (koszyk == null || koszyk.isEmpty()) {
            System.out.println("Nie masz żadnych produktów w koszyku!");
            Main.strona_glowna();
        } else {
            System.out.println("Złożyłeś zamówienie na produkty:");
            for (String produkt : koszyk) {
                System.out.println(produkt);
            }

        }
    }
}

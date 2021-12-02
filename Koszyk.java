
import java.util.ArrayList;
import java.util.Scanner;

public class Koszyk extends Klienci{

  public static  ArrayList<String> koszyk = new ArrayList<>();


  public static void koszyk() {
    for (String produkt : koszyk ) {
      System.out.println(produkt);
    }

    System.out.println("Złożyłeś zamówienie");

}
}
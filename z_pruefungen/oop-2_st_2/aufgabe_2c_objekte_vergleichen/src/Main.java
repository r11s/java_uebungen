import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Frucht> liste = new ArrayList<>();

        liste.add(new Frucht("Apfel", "rot"));
        liste.add(new Frucht("Birne", "weiss"));
        liste.add(new Frucht("Pflaume", "violett"));
        liste.add(new Frucht("Lychee", "weiss"));
        liste.add(new Frucht("Orange", "orange"));

        System.out.println(liste);

        liste.sort(null);

        System.out.println(liste);

    }
}

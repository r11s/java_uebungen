
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Flasche i = new Flasche();

        System.out.println(i.getInhalt());

        Flasche i1 = new Flasche<Integer>(123);

        System.out.println(i1.getInhalt());

        Flasche i2 = new Flasche<Double>(123.6);

        System.out.println(i2.getInhalt());

        Flasche i3 = new Flasche<Object>("10012" + 234 + " Haus");

        System.out.println(i3.getInhalt());

        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(1);
        liste.add(2);

        System.out.println(liste);
    }

}

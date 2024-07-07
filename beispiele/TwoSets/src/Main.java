import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new LinkedHashSet<>();

        setA.add(2);
        setA.add(3);
        setA.add(2);
        setA.add(3);
        setA.add(2);
        setA.add(3);
        setA.add(1);
        setA.add(1);

        setB.add(3);
        setB.add(1);
        setB.add(1);
        setB.add(1);
        setB.add(1);
        setB.add(1);
        setB.add(2);

        System.out.println(setA);
        System.out.println(setB);

        System.out.println(setA.equals(setB));

        List<Integer> listA = new LinkedList<>();
        List<Integer> listB = new LinkedList<>();

        listA.add(1);
        listA.add(2);
        // listA.add(2);
        // listA.add(2);
        listA.add(3);

        listB.add(3);
        listB.add(1);
        // listB.add(1);
        // listB.add(1);
        listB.add(2);

        System.out.println(listA);
        System.out.println(listB);

        System.out.println(listA.equals(listB));

        Iterator<Integer> it = listB.iterator();

        while (it.hasNext()) { // prüft, ob nächstes Element != null
            System.out.println(it.next()); // liefert nächstes Element
        }

        for (int x : listB) {
            System.out.println(x);
        }

        it = listB.iterator(); // Iterator zurücksetzen
        while (it.hasNext()) { // prüft, ob nächstes Element != null
            int x = it.next();

            System.out.println(x); // liefert nächstes Element
        }

        Map<Integer, String> map = new HashMap<>();

        map.put(7, "Hallo");
        map.put(81, "Welt");
        map.put(701, "Mars");
        map.put(801, "Mars");
        map.put(-22, "See");
        map.put(82, "Merkur");

        System.out.println(map);
        System.out.println(map.containsKey(701));
        System.out.println(map.containsKey(-701));

        System.out.println(map.containsValue("Mars"));

        Set<Integer> schluessel = map.keySet();
        System.out.println(schluessel);

        Collection<String> werte = map.values();
        ArrayList<String> werte2 = new ArrayList<>(map.values());

        System.out.println(werte);
        System.out.println(werte2);

        Object[] werte3 = werte.toArray(); // obere Lösungen sind einfacher
        for (Object a : werte3) {
            System.out.println((String) a);
        }

        System.out.println(map.entrySet());
    }

}

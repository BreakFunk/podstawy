package podzielnoscLiczb;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**Różnica pomiędzy tym, co metoda przyjmuje, a tym co ma w Sobie i jak ją odpalić w main*/

public class Pracownicy {

    public static void listaPracownikow() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Robert");
        names.add("Michalina");
        names.add("hania");
        names.add("ania");

        for (String s : names) {
            if (s.toLowerCase().startsWith("a")) { // bez nawiasu w ifie spróbuj :D
                System.out.println(s);
                System.out.println();
            }
        }
    }

    public static void zwrot(List<String> list) {
        for (String s : list) {
            if (s.toLowerCase().startsWith("a"));
            System.out.println(s);
        }
    }
}
package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO: Kolejka(to też kolekcja), kolekcja, jdbc(jest to interface), hibernate(orm), kilka wzorców definicje
// i do czego służą (nie kuć tego na pamięć)

public class Main {
    public static void main(String[] args) {

        /**Zwykła Array*/

        List<String> names = new ArrayList<>();

        names.add("Kasia");
        names.add("Basia");
        names.add("ania");
        names.add("maja");
        names.add("Hania");
        names.add("gosia");
        names.add("Anastazja");

    }
}
/* Podmiana w array odpada
*
* get - sout - Mapa
* is empty - sout - Mapa
* size - sout
* contains - sout - Mapa
* add - normalnie
* remove - normalnie - Mapa (po kluczu)
* clear - normalnie - Mapa
* Collections.sort(names); - normalnie, najpierw duże litery alfabetycznie, potem małe alfabetycznie
* Najzwyklejsze odtwarzanie listy - System.out.println(names);
* zwykła for - System.out.println(names.get(i)); - tak jak zwykły get, tylko dajesz (i) do srodka lub index danego imienia zamiast (i)
*
* for (int i = 0; i < names.size(); i++) {
            if (names.get(i).toLowerCase().startsWith("a")) {
                System.out.println(names.get(i));
            }
        }
*
* for (String s : names) {
            if (s.toLowerCase().startsWith("a")) {
                System.out.println(s);
            }
        }
*/
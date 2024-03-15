package zbiory;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();

        names.add("Kamil");
        names.add("Ana");
        names.add("kasia");
        names.add("hania");

    }
}

/*
* Prawie to samo jak w Array, tylko for each pętla i dwa elem. nie istnieją:
*
* Odpalasz - tylko w for each,
*
* isEmpty - sout,
* size - sout,
* contains - sout / tylko po nazwie,
* remove - normalnie, lub sout(wtedy pkaże true, lub false) / usuwasz tylko po nazwie,
* clear - normalnie,
* add - normalnie,
*
* Collectons.sort(); - nie istnieje
* get - nie istnieje w secie
*
* W TreeSet<>(); - dodaj byle jak, i posortuje hronologicznie
*
* for (String i : numbers) {
            if (i.toLowerCase().startsWith("k")) { - podajesz małą i wtedy bierze małe i duże, nie na odwrót
                System.out.println(i);
            }
        }
*/
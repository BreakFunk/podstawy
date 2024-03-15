package hash;

import hash.cats.Cat5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cat5 susie = new Cat5("Susie", "hjs", 54, 77.3);
        Cat5 Lester = new Cat5("Lester", "ss", 76, 5.9);
        Cat5 Lili = new Cat5("Lili", "ss", 87, 4.8);

        Map<Cat5, String> catOwnerMap = new HashMap<>();

        catOwnerMap.put(susie, "Kamil");
        catOwnerMap.put(Lester, "kasia");
        catOwnerMap.put(Lili, "ola");


        /** Problem z gettem */












        /*
        Set<Cat5> key = catOwnerMap.keySet();
        Collection<String> values = catOwnerMap.values(); // <--- Tu S tu nie XD
        //System.out.println(key + values); <--- nie łączysz tego razem

        for (Map.Entry<Cat5, String> entry : catOwnerMap.entrySet()) {
            System.out.println("Imię kotów " + entry.getKey()); // <--- gettery w sout ;)
            System.out.println("Imię właścicieli " + entry.getValue());
        }
        }
         */

        /*
        for (Cat key : catOwnerMap.keySet()) {
            String value = catOwnerMap.get(key);
            System.out.println(key + ": " + value);
        }
         */
        /*
        for (Map.Entry<Cat, String> entry : catOwnerMap.entrySet()) {
            System.out.println("Imiona kotów: " + entry.getKey());
            System.out.println("Imiona właścicieli: " + entry.getValue());
            System.out.println();
        }

        System.out.println(catOwnerMap.get(Lester));

        Set<Cat5> cat5Set = catOwnerMap.keySet();
        Collection<String> values = catOwnerMap.values();
        System.out.println(cat5Set);
        System.out.println(values);
        */
    }
}


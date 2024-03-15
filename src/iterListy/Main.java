package iterListy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] array = {"java", "python", "java", "SQL", "C"}; // kolejkowo, powrót, bez pętli for na końcu
        List<String> names = new ArrayList<>();
        names.add("Kamil");
        names.add("Jola");
        names.add("Gosia");
        names.add("Ola");


        //wypisz(names);
        //zwrot(List.of(array)); //czyli da się iteratorem zwrócić tablicę, ale w parametrach metody, musisz podać listę nie tabicę, inaczej nie pójdzie

    }












    public static void wypisz(List<String>list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    private static void zwrot(List<String>list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
    /** Chyba pokaże tylko unikaty*/

    private static void wypiszWymaluj2(List<String>list) {
        Iterator<String> iterator = list.iterator();
        iterator.hasNext();
        System.out.println(iterator.next());
    }
}


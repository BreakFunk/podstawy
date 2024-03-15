package unikalneImiona;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {
    public static final String NO_MORE_NAMES = "-";

    public static void main(String[] args) {
    }
}

/** dokładnie spójż, gdzie znajduje się zmienna NO_MORE_NAMES
 package unikalneImiona;

 import java.util.HashSet;
 import java.util.Scanner;
 import java.util.Set;

 public class Names {
 public static final String NO_MORE_NAMES = "-";

 public static void main(String[] args) {
 String name;
 Set<String> names = new HashSet<>();
 Scanner input = new Scanner(System.in);
 do {
 System.out.println("Podaj imie: ");
 name = input.next();
 if (!name.equals(NO_MORE_NAMES)) { // do póki imię jest różne od zmiennej - na odwrót nie jest różne, czyli jest takie samo
 names.add(name);
 }
 } while (!name.equals(NO_MORE_NAMES));


 System.out.println("Wprowadziłeś " + names.size() + " unikalne imiona.");
 }
 }
 */
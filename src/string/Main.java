package string;

public class Main {
    public static void main(String[] args) {

        /** Sprawdzanie długości Wyrazu z białymi znakami i bez białych znaków */

        //TODO: zmienias count na 1, zmieniasz != na == i liczy słowa a nie ltery
        /*
        String words = "Learn Java";
        int count = 0;
        System.out.println("Length of the String is: " + words.length());

        for (int i = 0; i <words.length(); i++) {
            if (words.charAt(i) != ' ') {
                count ++;
            }
        }
        System.out.println("Count of characters: " + count);
         */

        /** Sprawdzenie czy String zawiera daną literę */
        /*
        String string1 = "Katarzyna";
        String string2 = "Katarzyna";

        System.out.println(string1.contains("K"));
        System.out.println(string1.toLowerCase().contains("k"));

        boolean trueOrFalse = string1.contains("K");
        System.out.println(trueOrFalse);

        System.out.println(string1.contains(string2));
         */

        /** Wywołanie w SOUT statycznej met z innej kl*/
        /*
        String str = "Java programming question";
        System.out.println(Check.countWord(str));
         */

        /** Sprawdzenie ilości słów w Stringu w tej samej kl*/


        String str = "Java programming question"; // Przesyłasz tego stringa do tej met. poniżej:
        System.out.println(countWord(str)); // wywołujesz to bez klasy w Main przecież... returny w SOUT
    }

    private static int countWord(String str) { // Z innej beczki, jak działa metoda, czyli co zwraca i co przyjmuje met. do obliczenia/ do zwrócenia:
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ' &&
            i < str.length() - 1 && str.charAt(i + 1) != ' ')
                wordCount++;

        return wordCount;
    }
}


/** Ile słów zawiera dany string*/

class Check {

     static int countWord(String str) {
        int worldCount = 1;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ' &&
                    i < str.length() - 1 && str.charAt(i + 1) != ' ')
                worldCount++;

        return worldCount;
    }
}



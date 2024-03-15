package palindromStary;

public class Main {

    /** Palindrom na same Stringi*/
    private static boolean palindrome(String sentence) {
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i))
                return false;

        }
            return true;
    }

    /** Trudniejszy palindrom, tyczy się też cyfry, jest przerobiony na ten z góry*/
    private static boolean palindromee(String sentence) {
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i)) // bez zmiennych jak poniżej
                return false;
        }
        return true;

            /*char currentChar = sentence.charAt(i);
            char otherChar = sentence.charAt(sentence.length() -1 -i);

            if (currentChar != otherChar) {
                return false;
            }
        }

        return true;
             */
    }

    /** Palindrom na numery*/
    private static boolean palindromeee(long number) {
        return palindromee(Long.toString(number));
    }

    public static void main(String[] args) {

        System.out.println("Chyba na same cyfry: ");
        palindromeee(454);

        System.out.println("Chyba na same Stringi: ");
        System.out.println(palindrome("ala"));

        System.out.println("----------------");

        System.out.println("Sentences:");
        System.out.println(palindromee("Ala")); // Małe duże lit. to różnica
        System.out.println(palindromee("a aaa")); // tutaj brakuje obejścia białych znaków
        System.out.println(palindromee("abcddcba"));
        System.out.println(palindromee("xyzzyx"));
        System.out.println(palindromee("kobyla ma maly bok")); //?
        System.out.println(palindromee("oko w oko")); //?

        System.out.println();

        /**Za pierwszym razem działało teraz trzeba pisać Value of*/

        /*

        System.out.println("Numbers:");
        System.out.println(palindromee(String.valueOf(1234321));
        System.out.println(palindromee(1234554321));
        System.out.println(palindromee(1234));
        System.out.println(palindromee(782376));

         */


        System.out.println(Pal.palindrome("meme")); // return zawsze w sout?
    }
}

/** Palindrom na stringi z metodą, dla poćwiczenia metody*/
class Pal {
    static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
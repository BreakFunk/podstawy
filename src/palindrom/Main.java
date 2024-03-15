package palindrom;

public class Main {

    /** 1. Ten palindrom "Już nie działa. Powinien działać w obie strony bez value.of", teraz nie działa w żadną.
     * Czasami jak zmieniasz nazwę to potem komputer się mysli i każe wstawić value.of. Trzeba napisać je od razu dobrze*/
    private static boolean palindromee(String sentence) {
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i)) // bez zmiennych jak poniżej
                return false;
        }
        return true;
    }

    /** 2. Palindrom na numery*/
    private static boolean palindromee(long number) {
        return palindromee(Long.toString(number));
    }

    /** 3. String*/
    static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /** 1. Ten palindrom "Już nie działa. Powinien działać w obie strony bez value.of", teraz nie działa w żadną.
         * Czasami jak zmieniasz nazwę to potem komputer się mysli i każe wstawić value.of. Trzeba napisać je od razu dobrze*/

        System.out.println("Palindrome z value.of: ");
        System.out.println(palindromee(123321));
        System.out.println(palindromee("ala"));

        System.out.println("--------------------------");

        /** 2. Cyfry, działa*/

        System.out.println("Cyfry:");
        System.out.println(palindromee(444));

        System.out.println("--------------------------");

        /** 3. String, działa*/

        System.out.println("String:");
        System.out.println(palindrome("ala"));

        System.out.println("--------------------------");

        /** 4. Palindrom na stringi w metodzie, dla poćwiczenia metody*/
        System.out.println("Palindrom z metody: ");
        System.out.println(Pal.palindrome("mee"));

        System.out.println("--------------------------");

        /** 4. Palindrom na stringi w metodzie - palindrome2, dla poćwiczenia metody*/
        System.out.println("Palindrom z metody - palindrome2: ");
        System.out.println(Pal.palindrome2("mem"));

    }

    /** 4. Palindrom na stringi w metodzie, dla poćwiczenia metody*/
    class Pal {
        static boolean palindrome(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        /** 5. Inny palindrom na Stringi / /**Jeżeli dasz private to nie wywołasz tego w main / return false poza pętlami */
        static boolean palindrome2(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                char currentChar = s.charAt(i);
                char otherChar = s.charAt(s.length() - 1 - i);

                if (currentChar != otherChar) {
                    return false;
                }
            }
            return true;
        }
    }
}


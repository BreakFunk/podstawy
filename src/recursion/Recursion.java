package recursion;

public class Recursion {

    /**Rekurencja jest to algorytm rekurencyjny gdzie np. met. odwołuje się do samej siebie, lub objekt odwołuje się
     * do samego siebie (zapętlenie)*/
    public static long factorial(long n) { //getFactorial? silnia
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void recursion2(int i) {
        if (i < 1) return;
        System.out.println(i);
        recursion2(--i);
        //System.out.println("Wyjście z met. dla i = " + i);
    }

    /** To co powyżej, tylko inaczej zapisane*/
    public static void recursion(int i) {
        if (i >= 1) {
            System.out.println(i);
            i--;
            recursion(i);
        }
    }
    public static void main(String[] args) {

       /* for (int i = 5; i >= 1; i--) { // Odliczanie od 5 do 0. Taki o przykłąd, nie jest potrzebny w rekurencji
            System.out.println(i);
        }
        */


        System.out.println("-----------------------");

        System.out.println("-------------");
        recursion(9);

        System.out.println("-------------");

        recursion2(5);

        System.out.println("-------------");

        System.out.println(factorial(4));
        /*long start = System.nanoTime();
        long elapsed = System.nanoTime() - start;
        System.out.println("Czas (tiki procesora): " + elapsed);
         */
    }
}
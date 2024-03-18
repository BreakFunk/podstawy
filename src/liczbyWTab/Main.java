package liczbyWTab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //TODO: something

        int[] numbers = {4, 6, 0, 1, 1, 7, 3, 9, 2, 8, 12, 346, 50, 346}; //liczby parzyste i nieparzyste / porządkowanie liczb / boobleSort
        //int[] tab = {20, 30, 40}; // przesunięcie o jedno do przodu, musi być na końcu 4 each, dodatkowa tablica
        //Integer[] arr = {1,2,3,4,3,2}; //unique digits, stream
        //int[] tab = new int[] {1, 2, 3, 4}; // odwrocenie tab. zwykłe 4, w każdym jest i na końcu/
        //int[] numbers = {2, 4, 6, 8, 10}; // zamiana miejsc/ na krzyż


        /**Duplikaty: */
        /*
        boolean tmp = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j]==numbers[i]) {
                    System.out.println("Duplicate elements: " + numbers[i]);
                    tmp = true;
                }
        }
        if (tmp==false)
            System.out.println("Duplicate elements not found");
         */

        /** uporządkowane cyfry charaterystyczność: j + 1, inne miejsce jak w bubble, zamiast - dajesz + i zmienna gdzie indziej*/
        /*
        int min;
        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
         */

        /**Bubble sort, charakterystyczność: j + 1; - i - 1; wszędzie wszędzie przechodzi j i wszedzie jest tylko j*/
        /*
        int[] array = {4, 102, 7, 33, 2, 13, 9, 12, 6, 3, 8};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort:");
        for (int i : array) {
            System.out.print(i + " ");
        }
         */

        /** Liczby parzyste i nieparzyste, "po petli sout wyświetlać"*/
        /*
        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0){
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Even numbers " + even);
        System.out.println("Odd numbers " + odd);
        */

        /**Przesunięcie tab. o jedno dalej
         * co jest dla tego charakterystycznego, żeby to zapamiętać?*/
        /*
        int[] result = new int[3];

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                result[result.length - 1] = tab[0];
            } else {
                result[i - 1] = tab[i];
            }
        }

        for (int number : result) {
            System.out.println(number + " ");
        }
         */

        /** Odwacanie tab co jest charakterystyczne dla tej met?
         * dziwna pętla 4, odwrocona...*/

        /*
        int[] tab = new int[] {1, 2, 3, 4, 5};

        System.out.println("The oryginal array is: ");

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");

        System.out.println();
        System.out.println("Reversed array is: ");

        for (int i = tab.length -1; i >= 0; i--)
            System.out.print(tab[i] + " ");
         */

        /** Zamiana elem. w tab za pomocą dwóch zmiennych: */

        /*
        int[] numbers = {2, 4, 6, 8, 10};
        int lastIndex = numbers.length -1;

        int first = numbers[0];
        int last = numbers[lastIndex];

        numbers[0] = last;
        numbers[lastIndex] = first;

        for (int number : numbers)
            System.out.println(number);
            +91 734 95 02 777
         */

        /**Zamiana elem. w tab za pomocą jednej zmiennej,*/

        /*
        int[] numbers = {2, 4, 6, 8, 10};
        int lastIndex = numbers.length -1; // to można napisać bez tworzenia zmiennej, poza tym to nie jest zmienna pomocnicza, samo numbers.length -1

        int temp = numbers[0];             // int first = numbers[0];

        numbers[0] = numbers[lastIndex];   // usuwasz last, first zostawiasz i przekopiowujesz
        numbers[lastIndex] = temp;

        for (int number : numbers)
            System.out.println(number);
         */

        /**Zamiana elem. w tab bez żadnej zmiennej*/
        /*
        int[] numbers = {2, 4, 6, 8, 10};
        int lastIndex = numbers.length -1; // to można napisać bez tworzenia zmiennej pomocniczej, samo numbers.length -1

        numbers[0] = numbers[0] + numbers[lastIndex];
        numbers[lastIndex] = numbers[0] - numbers[lastIndex];
        numbers[0] = numbers[0] - numbers[lastIndex];

        for (int number : numbers)
            System.out.println(number);
         */

        /**Unikalne elementy z tab[] - stream java 8*/
        /*
        List<Integer> uniqeValues
                = Arrays.stream(arr).distinct().toList();
        System.out.println("Unique values of Table[]");

        for (int i = 0; i < uniqeValues.size(); ++i) {
            System.out.println(uniqeValues.get(i));
        }
         */

        /**Unikalne wartości z tablicy, za pomocą hashset*/
        /*
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(15);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        Set<Integer> uniqueNumers = new HashSet<Integer>(numbers);

        for (Integer i : uniqueNumers) {
            System.out.println(i);
        }
        */
    }
}
package proby;

import java.util.*;

public class Proby {
    public static void main(String[] args) {
        int[] numbers = {4, 102, 7, 33, 2, 13, 9, 12, 6, 3, 8, 8, 7, 33};
        String[] array = {"java","python", "java", "SQL", "C"}; // kolejkowo, powrót, bez pętli for na końcu
        //int[] numbers = new int[]{1, 2, 3, 4, 5}; // <--- Zwykła zamina z dwuch zmiennych na jedną
        //int[] tab = {20, 30, 40};
        //System.out.println(fibonnaci(12));
        //System.out.println(factorial(4));
        //String words = "Learn Java java meeee";
        /*List<String> array = new ArrayList<>();
        array.add("cos");
        array.add("cos");
        array.add("meee");
         */

        //bubbleSort(numbers);
        //doubleCharacters(array);

/*
* for (int i = 0; i < arr.length; i++)
* zwrot(List.of(arr));
*/

/** System.out.println("Length of the String is " + words.length());
 System.out.println("Count of characters is " + count);
 System.out.println("Count of words in the sentence is " +countWord(words)); */

/*
 Set<Number> someNumbers = new HashSet<>();
        someNumbers.add(new Integer(123));
        someNumbers.add(new Float(3.1415));
        someNumbers.add(new Double(299.988));
        someNumbers.add(new Long(67000));

        Iterator<Number> someNumbersIterator = someNumbers.iterator();

        while(someNumbersIterator.hasNext()) {
            System.out.println(someNumbersIterator.next());
        }
 */

/** To jest chyba konwersacja do tablicy i do tablicy int, bo do Integer wystarczy tylko poprawić na Integer Stringa
 * stary stream po prostu wszystko do listy robisz i w for wywołujesz */
/*
* List<String> uniqueNames =
                Arrays.stream(array).distinct().toList();
                *
        for (int i = 0; i < uniqueNumbers.size(); i++)
            System.out.println(uniqueNumbers.get(i));

 int[] uniqueNumbers =
                Arrays.stream(numbers).distinct().toArray();
        for (int i = 0; i < uniqueNumbers.length; i++)
            System.out.println(uniqueNumbers[i]);
*/

/**unikalne elementy ale z array listy*/
/*
* List<String> unigueString =
                array.stream().distinct().toList();


        for (int i = 0; i < unigueString.size(); i++) {
            System.out.println(unigueString.get(i));
*/

/**bubble sort w metodzie*/
/*
public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { // zmienisz znak na odwrót i odwrotnie posortuje
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i); // mozesz ja dać w mainie
        }
    }
 */
    /** Metoda zwracająca podwójny element:*/
        /*
    public static void doubleCharacters(String array[]) {

        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate elements: " + array[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicate elements not found");
        }*/
    }
}


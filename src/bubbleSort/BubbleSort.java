package bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {


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

        //bubbleSort(array);

        //Bubble.bubbleSort(array);

        System.out.println("Bubble sort:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


/** Nie musi być tutaj tej met. wystarczy ciało w metodzie main*/
    /*
    private static void bubbleSort(int[] array) {
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }
    */
}

/** Met nie może być private i nie musi być public. public jest to tylko po to żeby nie było dostępu z innych klas
 * do main*/
class Bubble {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { //Odwrócony ten znak < spowoduje odwrotne wyświetlanie
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
// nie jest return i bez sout, ale w main musisz odpalić za pom. for each
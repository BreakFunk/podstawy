package podzielnoscLiczb;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //BankAccount p = new Bank();
        //System.out.println(p.accountBalance());



        /** Liczba pdzielna przez 2 i samą siebie*/
        /*
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - This number is divisible by 2 and itself");
            }
        }
        */

        /** Czy liczba jest podzielna przez 2? */
        /*
        int num = 5;

        if (num % 2 == 0) {
            System.out.println(num + " - is divisible by 2");
        } else {
            System.out.println(num + " - is not divisible by 2");
        }
        */

        /** Random */
        /*
        Random random = new Random();

        //int numbers = random.nextInt(100) +1;
        //System.out.println(numbers);

        Set<Integer> lista = new HashSet<>();
        while (lista.size() < 3 ) {
            lista.add(random.nextInt(10) +1);
        }
        System.out.println(lista);
         */

        /**Zwrot listy przez metodę*/
        /*
        Pracownicy.listaPracownikow();

        List<String> names2 = new ArrayList<>();

        names2.add("Adam");
        names2.add("Marzena");
        names2.add("Piotr");
        names2.add("Łukasz");

        Pracownicy.zwrot(names2);
        System.out.println();
        System.out.println(names2.get(0));
        */

        BankAccount bankAccount = new Bank();
        System.out.println(bankAccount.accountBalance());
        ((Bank)bankAccount).coś(); // <= rzutowanie
    }
}

/** Interface i met. zwracająca saldo bankowego konta */

class Bank implements BankAccount {
    private int saldo;

    public Bank() {
        saldo = 1000;
    }

    public void coś() {
        System.out.println("coś");
    }

    @Override
    public int accountBalance() {
        return saldo;
    }
}

interface BankAccount {
    int accountBalance();
}

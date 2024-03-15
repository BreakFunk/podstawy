package bankAcoount;

public class Main {
    public static void main(String[] args) {

        BankAccount p = new Bank();
        System.out.println(p.accountBalance());
    }

    static class Bank implements BankAccount {
        private int saldo;

        public Bank() {
            saldo = 1000;
        }

        @Override
        public int accountBalance() {
            return saldo;
        }
    }

    interface BankAccount {
        int accountBalance();
    }
}
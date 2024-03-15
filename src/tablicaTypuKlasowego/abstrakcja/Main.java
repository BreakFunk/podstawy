package tablicaTypuKlasowego.abstrakcja;

public class Main {

    public static void main(String[] args) {

        Osoba [] osoba = new Osoba[2];

        osoba [0] = new Pracownik("Kamil", "Fuks", 100);
        osoba [1] = new Student("Paweł", "Herbut");

        for (int i=0; i<osoba.length; i++) {
            osoba[i].pobierzOpis();

        
        /*for (Osoba person : osoba) {
            if (person instanceof Osoba){
                ((Pracownik)person).pobierzOpis();*/
            }
        }
    }
//}
abstract class Osoba
{
    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();

}

class Pracownik extends Osoba
{

    double wynagrodzenie;

    public Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }

    void pracuj()
    {
        System.out.println("Ja pracuję");
    }
}

class Student extends Osoba
{

    public Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}

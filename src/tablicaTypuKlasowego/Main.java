package tablicaTypuKlasowego;

import streamy.Employee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Julia", "Baran", 45);
        employees[1] = new Employee("Barbara", "kot", 18);
        employees[2] = new Employee("Anna", "Modrzew", 24);
        employees[3] = new Employee("Jola", "Kula", 41);
        employees[4] = new Employee("Gosia", "żaba", 21);
        employees[5] = new Employee("Ewa", "Fijak", 33);


        /**Filter na górze i w filtrze bierzesz co chcesz. Mapowanie zastępujesz lambdę referencją do metody*/

        Arrays.stream(employees)
                .filter(e -> e.getAge() <= 24)
                .filter(e -> e.getName().toLowerCase().startsWith("a")) // W filtrze nie w mapie musi to byc "a" filter wyżej
                .map(Employee::getName)
                .toList()
                        .forEach(System.out::println);


        /*
        Arrays.stream(employees)
                .filter(employee -> employee.getAge() <= 30)
                .limit(20).toList()
                .forEach(System.out::println);
         */
        //tablica(employees);
        //cos(employees);
    }

    /**
     * Do tablic chyba nie trzeba toString jak do streamów List
     */
    public static void tablica(Employee[] employees) {
        Arrays.stream(employees)
                .filter(employee -> employee.getAge() <= 30)
                .filter(employee -> employee.getName().startsWith("a"))
                .limit(20).toList()
                .forEach(System.out::println);
    }

    /**
     * Muszą być gettery i do stremów i do tablic, także chyba olać
     */
    public static void cos(Employee[] employees) {
        for (Employee e : employees) {
            if (e.getAge() <= 30 && e.getName().startsWith("B")) {
                System.out.println(e);
            }
        }
    }

    public void mapOperation(Employee[] employees) {
        // Inaczej się zaczyna niż z listą
        Arrays.stream(employees)
                .map(employee -> employee.getName() + " " + employee.getLastName())
                .forEach(System.out::println);
    }
}
/*
public void mapOperation() {
        employees.stream()
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .forEach(System.out::println);
* */
package streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Robert", "Wsiaki", 32);
        Employee employee2 = new Employee("Piotr", "Mietus", 20);
        Employee employee3 = new Employee("Ola", "Ucho", 18);
        Employee employee4 = new Employee("Katarzyna", "nos", 40);

        List<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        /*employees.stream()
                .filter(employee -> employee.getAge() <= 30)
                .limit(20).toList()
                .forEach(System.out::println);
         */

        //imiona(employees);
    }

    public static void wiek(List<Employee> employees) {
        /** filter musi być nad mapingiem*/
        employees.stream()
                .filter(e -> e.getAge() <= 30)
                .map(e -> e.getName() + " " + e.getLastName())
                .limit(20).toList()
                .forEach(System.out::println);
    }

    public static void imiona(List<Employee>list) {
        for (Employee s : list) {
            if (s.getLastName().startsWith("M") && s.getAge() <= 25) {
            //} else if (s.getAge() <= 25) { <--- tak tego nie możesz napisać... tak jak wyżej ma być
                System.out.println(s);
            }
        }
    }
}

/** Najprostsze streamy: */
/*
* Arrays.stream(numbers)
                .distinct()
                .forEach(System.out::println);
*/
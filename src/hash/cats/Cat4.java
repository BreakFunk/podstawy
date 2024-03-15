package hash.cats;

import java.util.Objects;

public class Cat4 {
    private String name;
    private String lastName;
    private int age;

    public Cat4(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat4 cat4 = (Cat4) o;
        return age == cat4.age && Objects.equals(name, cat4.name) && Objects.equals(lastName, cat4.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }
}

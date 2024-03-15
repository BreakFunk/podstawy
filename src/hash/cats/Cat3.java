package hash.cats;

import java.util.Objects;

public class Cat3 {
    private String name;
    private String lastName;

    public Cat3(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat3 cat3 = (Cat3) o;
        return Objects.equals(name, cat3.name) && Objects.equals(lastName, cat3.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return name + lastName;
    }
}

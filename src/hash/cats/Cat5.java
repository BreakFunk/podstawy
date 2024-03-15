package hash.cats;

import hash.cats.Cat;

import java.util.Objects;

public class Cat5 {
    private String name;
    private String lastName;
    private int age;
    private double weight;

    public Cat5(String name, String lastName, int age, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat5 cat5 = (Cat5) o;
        return age == cat5.age && Double.compare(cat5.weight, weight) == 0 && Objects.equals(name, cat5.name) && Objects.equals(lastName, cat5.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, weight);
    }

    @Override
    public String toString() {
        return name;
    }
}

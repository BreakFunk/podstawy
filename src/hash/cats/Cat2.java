package cats;

import java.util.Objects;

public class Cat2 {
    private String name;

    public Cat2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat2 cat2 = (Cat2) o;
        return Objects.equals(name, cat2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return age == cat.age && Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

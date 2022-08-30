package Lesson1.Geo;



import Lesson1.Geo.Animal.Animal;
import Lesson1.Geo.Animal.Communication;

import java.util.Objects;

public class Person implements Communication {
    public String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public void call(Animal animal) {
        System.out.printf("%s called %s, %s said %s\n", this.fullName, animal.getName() , animal.getName(), animal.voice());
    }
}

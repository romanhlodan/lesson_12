package ua.com.hrv;

import java.util.Objects;

public class Engine {
    private int number_of_cylinders;

    public Engine(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }

    public int getNumber_of_cylinders() {
        return number_of_cylinders;
    }

    public void setNumber_of_cylinders(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return number_of_cylinders == engine.number_of_cylinders;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number_of_cylinders);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "number_of_cylinders=" + number_of_cylinders +
                '}';
    }
}

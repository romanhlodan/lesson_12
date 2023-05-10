package ua.com.hrv;

import java.util.Objects;

public class Car {
    private int hp;
    private int year_of_manuf;
    Helm helm;
    Engine engine;

    public Car(int hp, int year_of_manuf, Helm helm, Engine engine) {
        this.hp = hp;
        this.year_of_manuf = year_of_manuf;
        this.helm = helm;
        this.engine = engine;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getYear_of_manuf() {
        return year_of_manuf;
    }

    public void setYear_of_manuf(int year_of_manuf) {
        this.year_of_manuf = year_of_manuf;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return hp == car.hp &&
                year_of_manuf == car.year_of_manuf &&
                Objects.equals(helm, car.helm) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, year_of_manuf, helm, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", year_of_manuf=" + year_of_manuf +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}

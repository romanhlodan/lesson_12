package ua.com.hrv;

import java.util.Objects;

public class Helm {
    private int diameter;
    private String material;

    public Helm(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helm helm = (Helm) o;
        return diameter == helm.diameter &&
                Objects.equals(material, helm.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, material);
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}

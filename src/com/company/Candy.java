package com.company;

import java.util.Objects;

public class Candy extends Sweet{
    public enum CandyType {
        CHOCOLATE, TOFFEE, GELATIN
    }
    public enum FillingType{
        CHOCOLATE, CREAM, AlCOHOL,NOFILLING
    }
    private CandyType type;
    private FillingType filling;

    public CandyType getType() {
        return type;
    }

    public void setType(CandyType type) {
        this.type = type;
    }

    public FillingType getFilling() {
        return filling;
    }

    public void setFilling(FillingType filling) {
        this.filling = filling;
    }

    public Candy(int weight, int caloric, double sugarPersent, CandyType type, FillingType filling) {
        super(weight, caloric, sugarPersent);
        this.type = type;
        this.filling = filling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return type == candy.type &&
                filling == candy.filling;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, filling);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "type=" + type +
                ", filling=" + filling +
                ", weight=" + this.getWeight() +
                '}';
    }
}

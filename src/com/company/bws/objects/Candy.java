package com.company.bws.objects;

import com.company.bws.enums.CandyType;
import com.company.bws.enums.FillingType;

import java.util.Objects;

public class Candy extends Sweet {

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

    public Candy() {

    }

    public Candy(int weight, int caloric, double sugarPersent, CandyType type, FillingType filling) throws SweetLogicException {
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
                "type = " + type +
                ", filling = " + filling +
                ", weight = " + this.getWeight() +
                ", caloric = " + this.getCaloric() +
                ", sugarPersent = " + this.getSugarPersent() +
                '}';
    }
}

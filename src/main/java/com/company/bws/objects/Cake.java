package com.company.bws.objects;

import com.company.bws.enums.CakeType;

import java.util.Objects;

public class Cake extends Sweet {

    private CakeType cake;

    public Cake() {

    }

    public Cake(int weight, int caloric, double sugarPersent, CakeType cake) {
        super(weight, caloric, sugarPersent);
        this.cake = cake;
    }

    public CakeType getCake() {
        return cake;
    }

    public void setCake(CakeType cake) {
        this.cake = cake;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "weight = " + this.getWeight() +
                ", caloric = " + this.getCaloric() +
                ", sugarPersent = " + this.getSugarPersent() +
                ", cake filling = " + this.getCake() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cake cake1 = (Cake) o;
        return cake == cake1.cake;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cake);
    }
}

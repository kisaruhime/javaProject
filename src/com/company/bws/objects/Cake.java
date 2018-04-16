package com.company.bws.objects;

import com.company.bws.enums.CakeType;

import java.util.Objects;

public class Cake extends Sweet {

    private CakeType cake;

    public CakeType getCake() {
        return cake;
    }

    public void setCake(CakeType cake) {
        this.cake = cake;
    }

    public Cake(){

    }

    public Cake(int weight, int caloric, double sugarPersent, CakeType cake) {
        super(weight, caloric, sugarPersent);
        this.cake = cake;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake1 = (Cake) o;
        return cake == cake1.cake;
    }

    @Override
    public int hashCode() {

        return Objects.hash(cake);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cake=" + cake +
                "weight=" + this.getWeight() +
                '}';
    }
}

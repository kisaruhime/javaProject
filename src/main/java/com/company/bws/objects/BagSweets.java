package com.company.bws.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BagSweets implements Serializable {

    private List<Sweet> bag = new ArrayList<Sweet>();

    private int weight;


    public BagSweets(List<Sweet> bag) {
        this.bag = new ArrayList<Sweet>(bag);
    }

    public BagSweets() {

    }

    public List<Sweet> getBag() {
        return bag;
    }

    public void setBag(List<Sweet> bag) {
        this.bag = bag;
    }


    public void setWeight() {
        weight = 0;
        if (this.bag.size() != 0) {
            for (Sweet i : this.bag) {
                weight += i.getWeight();
            }
        }

    }

    public int getWeight() {
        if (this.weight == 0) {
            this.setWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "BagSweets{" +
                "bag = " + bag.toString() +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagSweets bagSweets = (BagSweets) o;
        return weight == bagSweets.weight &&
                Objects.equals(bag, bagSweets.bag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bag, weight);
    }
}

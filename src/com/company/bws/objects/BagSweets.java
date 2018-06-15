package com.company.bws.objects;

import java.io.Serializable;
import java.util.Arrays;

public class BagSweets implements Serializable{
    private Sweet[] bag;
    private int weight;

    public BagSweets(){
        this.bag = new Sweet[]{};

    }
    public Sweet[] getBag() {
        return bag;
    }

    public void setBag(Sweet[] bag) {
        this.bag = bag;
    }

    public void setWeight() {
        weight=0;
        if(this.bag.length != 0) {
            for (Sweet i : this.bag){
                weight += i.getWeight();
            }
        }

    }

    public int getWeight() {
        if(this.weight == 0){
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
}

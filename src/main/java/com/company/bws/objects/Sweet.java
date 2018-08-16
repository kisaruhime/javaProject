package com.company.bws.objects;

import java.io.Serializable;
import java.util.Objects;

public abstract class Sweet implements Serializable{
    private int weight;
    private int caloric;
    private double sugarPersent;

    public Sweet() {
    }

    public Sweet(int weight, int caloric, double sugarPersent) {
        this.weight = weight;
        this.caloric = caloric;
        this.sugarPersent = sugarPersent;
    }

//    public  int compareTo(Sweet other){
//        return this.weight - other.getWeight();
//    }

    public double sugarWeight() {
        return this.weight * this.sugarPersent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCaloric() {
        return caloric;
    }

    public void setCaloric(int caloric) {
        this.caloric = caloric;
    }

    public double getSugarPersent() {
        return sugarPersent;
    }

    public void setSugarPersent(double sugarPersent) {
        this.sugarPersent = sugarPersent;
    }




    @Override
    public String toString() {
        return "Sweet{" +
                "weight=" + weight +
                ", caloric=" + caloric +
                ", sugarPersent=" + sugarPersent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return weight == sweet.weight &&
                caloric == sweet.caloric &&
                Double.compare(sweet.sugarPersent, sugarPersent) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, caloric, sugarPersent);
    }
}

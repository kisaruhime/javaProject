package com.company.bws.objects;

public abstract class Sweet {
    private int weight;
    private int caloric;
    private double sugarPersent;

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

    public Sweet() {
    }

    public Sweet(int weight, int caloric, double sugarPersent) {
        this.weight = weight;
        this.caloric = caloric;
        this.sugarPersent = sugarPersent;
    }

    public double sugarWeight() {
        return this.weight * this.sugarPersent;
    }
}

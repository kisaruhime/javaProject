package com.company;

public class Main {

    public static void main(String[] args) {

        BagSweets bag = new BagSweets();
        SweetInitializator.sweetsInitialize(bag.getBag());
        System.out.println("Общий вес подарка :" + bag.getWeight());
        BubbleSort.sort(bag.getBag());
        ArrayPrint.print(bag.getBag());
        //IntersectionSort.insertIntoSort(bag.getBag());
        //ArrayPrint.print(bag.getBag());
        int sugarRange1 = 10;
        int sugarRange2 = 20;
        SweetSugarSearch.searchSweet(bag.getBag(),sugarRange1,sugarRange2);


    }
}

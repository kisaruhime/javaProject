package com.company;

import com.company.bws.helpers.ArrayPrint;
import com.company.bws.helpers.SweetInitializator;
import com.company.bws.helpers.SweetSugarSearch;
import com.company.bws.objects.BagSweets;
import com.company.bws.objects.Stock;
import com.company.bws.sorts.BubbleSort;

public class Main {

    public static void main(String[] args) {

//        BagSweets bag = new BagSweets();
//        SweetInitializator.sweetsInitialize(bag.getBag());
//        System.out.println("Общий вес подарка :" + bag.getWeight());
//        BubbleSort.sort(bag.getBag());
//        ArrayPrint.printBag(bag.getBag());
//        //IntersectionSort.insertIntoSort(bag.getBag());
//        //ArrayPrint.print(bag.getBag());
//        int sugarRange1 = 1;
//        int sugarRange2 = 5;
//        SweetSugarSearch.searchSweet(bag.getBag(), sugarRange1, sugarRange2);

        Stock newStock = new Stock();
        newStock.initialixeStock();
        ArrayPrint.stockContent(newStock);

    }
}

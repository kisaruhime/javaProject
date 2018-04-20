package com.company.bws.helpers;

import com.company.bws.objects.BagSweets;
import com.company.bws.objects.Stock;
import com.company.bws.objects.Sweet;

public class ArrayPrint {
    public static void printBag(Sweet[] arr) {
        for (Sweet j : arr) {
            System.out.println(j);
        }
    }

    public static void stockContent(Stock stock){
        for(int i = 0;i<stock.getBags().length;i++){
            System.out.println("Content of gift" + i+ " :" );
            ArrayPrint.printBag(stock.getBags()[i].getBag());
        }
    }
}

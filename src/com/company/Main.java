package com.company;

import com.company.bws.helpers.ArrayPrint;
import com.company.bws.helpers.FileSweetsWriter;
import com.company.bws.helpers.SweetInitializator;
import com.company.bws.helpers.SweetSugarSearch;
import com.company.bws.objects.BagSweets;
import com.company.bws.objects.Stock;
import com.company.bws.sorts.BubbleSort;

public class Main {

    public static void main(String[] args) {

        Stock newStock = new Stock();
        newStock.initialixeStock();
        FileSweetsWriter.FileWrite("files\\stock_01.txt",newStock);
        ArrayPrint.stockContent(newStock);

    }
}

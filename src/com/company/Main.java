package com.company;

import com.company.bws.helpers.ArrayPrint;
import com.company.bws.helpers.FileSweetsWriter;
import com.company.bws.helpers.SerializationTool;
import com.company.bws.helpers.SweetInitializator;
import com.company.bws.helpers.SweetSugarSearch;
import com.company.bws.objects.BagSweets;
import com.company.bws.objects.Stock;
import com.company.bws.sorts.BubbleSort;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Stock newStock = new Stock();
        newStock.initialixeStock();
        FileSweetsWriter.FileWrite("files\\stock_01.txt", newStock);
        SerializationTool sz = new SerializationTool();
        boolean b = sz.serialization(newStock, "files\\sz01.txt");
        System.out.println(b);
        Stock newstock_02 = null;
        try {
            newstock_02 = sz.deserialization("files\\sz01.txt");
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        ArrayPrint.stockContent(newstock_02);

    }
}

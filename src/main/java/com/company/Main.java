package com.company;

import com.company.bws.helpers.ArrayPrint;
import com.company.bws.helpers.FileSweetsWriter;
import com.company.bws.helpers.SerializationTool;
import com.company.bws.objects.Stock;

import java.io.InvalidObjectException;

public class Main {

    public static void main(String[] args) {

        Stock newStock = new Stock();
        newStock.initialixeStock();
        FileSweetsWriter.FileWrite("src\\main\\resources\\stock_01.txt", newStock);
        SerializationTool sz = new SerializationTool();
        boolean b = sz.serialization(newStock, "src\\main\\resources\\sz01.txt");
        System.out.println(b);
        Stock newstock_02 = null;
        try {
            newstock_02 = sz.deserialization("src\\main\\resources\\sz01.txt");
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        ArrayPrint.stockContent(newstock_02);

    }
}

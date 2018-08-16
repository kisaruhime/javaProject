package com.company;

import com.company.bws.helpers.ArrayPrint;
import com.company.bws.helpers.FileSweetsWriter;
import com.company.bws.helpers.SerializationTool;
import com.company.bws.helpers.SerializeJSON;
import com.company.bws.helpers.XMLSerialize;
import com.company.bws.objects.Stock;
import com.company.bws.sorts.BubbleSort;

import java.io.FileNotFoundException;
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

       // SerializeJSON.serialize("src\\main\\resources\\JSON.json", newstock_02);
        //Stock newstock3 = SerializeJSON.deserialize("src\\main\\resources\\JSON.json");
       // ArrayPrint.stockContent(newstock3);
        Stock new_stock3 = new Stock();
        try{
            XMLSerialize.serialize("src\\main\\resources\\serxml.xml", newstock_02);
            new_stock3 = XMLSerialize.deserialize("src\\main\\resources\\serxml.xml");
            ArrayPrint.stockContent(new_stock3);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        System.out.println(newstock_02.equals(new_stock3));
//        BubbleSort.sort(newStock.getBags().get(0).getBag());
//        ArrayPrint.stockContent(newStock);
    }
}

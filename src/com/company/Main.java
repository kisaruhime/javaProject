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

//        Stock newStock = new Stock();
//        newStock.initialixeStock();
//        FileSweetsWriter.FileWrite("files\\stock_01.txt",newStock);
//        SerializationTool sz = new SerializationTool();
//        boolean b = sz.serialization(newStock, "files\\sz01.txt");
//        System.out.println(b);
//        Stock newstock_02 = null;
//        try{
//            newstock_02 = sz.deserialization("files\\sz01.txt");
//        }
//        catch(InvalidObjectException e){
//            e.printStackTrace();
//        }
//        ArrayPrint.stockContent(newstock_02);

        Scanner sc1 = new Scanner(System.in);
        int x1 = 0;
        x1 = sc1.nextInt();
        //sc1.close();
        int x2 = 0;
        try{
        x2 = System.in.read();}
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(x1 + " " + (char) x2);

    }
}

package com.company;

import com.company.bws.helpers.*;
import com.company.bws.objects.Stock;

import java.io.FileNotFoundException;
import java.io.InvalidObjectException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        Stock newStock = new Stock();
        newStock.initialixeStock();
        FileSweetsWriter.FileWrite("src\\main\\resources\\stock_01.txt", newStock);
        ReadWriteLock lock = new ReentrantReadWriteLock();
//        Lock lock = new ReentrantLock();
//        for (int i = 1; i < 2; i++){
//            Thread t = new Thread();
//            t.setName("Thread "+ i);
//            t.start();
//        }

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(new ReadFileThread("src\\main\\resources\\stock_01.txt", lock));
        executor.submit(new WriteFileThread("src\\main\\resources\\stock_01.txt", lock));

        SerializationTool sz = new SerializationTool();
        boolean b = sz.serialization(newStock, "src\\main\\resources\\sz01.txt");
        System.out.println(b);
        Stock newstock_02 = null;
        try {
            newstock_02 = sz.deserialization("src\\main\\resources\\sz01.txt");
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
       // ArrayPrint.stockContent(newstock_02);

       // SerializeJSON.serialize("src\\main\\resources\\JSON.json", newstock_02);
        //Stock newstock3 = SerializeJSON.deserialize("src\\main\\resources\\JSON.json");
       // ArrayPrint.stockContent(newstock3);
        Stock new_stock3 = new Stock();
        try{
            XMLSerialize.serialize("src\\main\\resources\\serxml.xml", newstock_02);
            new_stock3 = XMLSerialize.deserialize("src\\main\\resources\\serxml.xml");
          //  ArrayPrint.stockContent(new_stock3);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


//        System.out.println(newstock_02.equals(new_stock3));
//        System.out.println("Before quicksort");
//        QuickSort.quickSort(new_stock3);
//        System.out.println("After quicksort");
//        ArrayPrint.stockContent(new_stock3);
//
//        Sweet sweet = new_stock3.getBags().get(5).getBag().get(0);
//        System.out.println(BinarySearch.search(new_stock3,sweet));

        try {
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.MINUTES);
        }catch(InterruptedException e){
            e.printStackTrace();
        } finally {
            executor.shutdownNow();
        }
    }
}

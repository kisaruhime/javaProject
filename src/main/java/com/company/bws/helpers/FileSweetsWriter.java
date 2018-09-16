package com.company.bws.helpers;

import com.company.bws.objects.Stock;
import com.company.bws.objects.Sweet;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;


public class FileSweetsWriter {

    public static void FileWrite(String path, Stock stock) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path), true)))){
            List<Sweet> arr;
            for (int i = 0; i < stock.getBags().size(); i++) {
                pw.println("Content of gift" + i + " :");
                arr = stock.getBags().get(i).getBag();
                for (Sweet j : arr) {
                    pw.printf(j.toString());
                    pw.printf("; ");
                }
                pw.println();
            }
        } catch (IOException e) {
            System.err.println("ошибка открытия потока " + e);
        }
    }

}

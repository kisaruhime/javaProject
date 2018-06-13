package com.company.bws.helpers;

import com.company.bws.objects.Stock;
import com.company.bws.objects.Sweet;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;


public class FileSweetsWriter {

    public static void FileWrite(String path, Stock stock) {
        File f = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            //pw.printf("Java %.2g%n");// запись прямо в файл
            Sweet[] arr;
            for (int i = 0; i < stock.getBags().length; i++) {
                pw.println("Content of gift" + i + " :");
                arr = stock.getBags()[i].getBag();
                for (Sweet j : arr) {
                    pw.printf(j.toString());
                    pw.printf("; ");
                }
                pw.println();
            }
        } catch (IOException e) {
            System.err.println("ошибка открытия потока " + e);
        } finally {
            if (pw != null) {
                pw.close();

            }
        }
    }

}

package com.company.bws.helpers;

import com.company.bws.objects.Cake;
import com.company.bws.objects.Candy;
import com.company.bws.objects.Cookie;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public static Integer[] readFromFile(String str) {
        BufferedReader br = null;
        Integer[] values;
        try {
            br = new BufferedReader(new FileReader("files\\candy.txt"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                String[] strings = tmp.split("\\s");
                values = new Integer[strings.length];
                int i=0;
                for(String s : strings){
                    values[i] = Integer.valueOf(s);
                    i++;
                }
            }
            return values;
        } catch (IOException e) {
            System.err.println("ошибка открытия потока " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

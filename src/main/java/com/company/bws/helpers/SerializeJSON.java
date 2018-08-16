package com.company.bws.helpers;

import com.company.bws.objects.Stock;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeJSON {

    public static void serialize(String filename, Stock stock) {
//        Gson gson = new Gson();
//        String str = gson.toJson(stock);
//        boolean flag = false;
//        File f = new File(filename);
//        ObjectOutputStream ostream = null;
//        try {
//            FileOutputStream fos = new FileOutputStream(f);
//            if (fos != null) {
//                ostream = new ObjectOutputStream(fos);
//                ostream.writeObject(str); // сериализация
//                flag = true;
//            }
//        } catch (FileNotFoundException e) {
//            System.err.println("Файл не может быть создан: " + e);
//        } catch (NotSerializableException e) {
//            System.err.println("Класс не поддерживает сериализацию: " + e);
//        } catch (IOException e) {
//            System.err.println(e);
//        } finally {
//            try {
//                if (ostream != null) {
//                    ostream.close();
//                }
//            } catch (IOException e) {
//                System.err.println("ошибка закрытия потока");
//            }
//        }
//        return flag;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filename), stock);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Stock deserialize(String filename) {
//        Gson gson = new Gson();
//        File fr = new File(filename);
//        ObjectInputStream istream = null;
//        try {
//            FileInputStream fis = new FileInputStream(fr);
//            istream = new ObjectInputStream(fis);
//            String str = (String) istream.readObject();
//            Stock st = gson.fromJson(str, Stock.class);
//            return st;
//        } catch (ClassNotFoundException ce) {
//
//            System.err.println("Класс не существует: " + ce);
//        } catch (FileNotFoundException e) {
//            System.err.println("Файл для десериализации не существует: " + e);
//        } catch (InvalidClassException ioe) {
//            System.err.println("Несовпадение версий классов: " + ioe);
//        } catch (IOException ioe) {
//            System.err.println("Общая I/O ошибка: " + ioe);
//        } finally {
//            try {
//                if (istream != null) {
//                    istream.close();
//                }
//            } catch (IOException e) {
//                System.err.println("ошибка закрытия потока ");
//            }
//        }
//        return null;


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filename), Stock.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

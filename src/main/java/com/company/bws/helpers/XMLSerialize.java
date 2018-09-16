package com.company.bws.helpers;

import com.company.bws.objects.Stock;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XMLSerialize {

    public static void serialize(String filename, Stock stock) throws FileNotFoundException {

        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        x.writeObject(stock);
        x.close();

    }

    public static Stock deserialize(String filename) throws FileNotFoundException {

        XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)));
        Stock stock = (Stock) x.readObject();

        x.close();
        return stock;
    }

}

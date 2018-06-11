package com.company.bws.helpers;

import com.company.bws.enums.*;
import com.company.bws.objects.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SweetInitializator {
//    public static Sweet[] sweetsInitialize(Sweet[] arr) {
//        arr[0] = new Candy(30, 450, 0.1, CandyType.CHOCOLATE, FillingType.CREAM);
//        arr[1] = new Candy(20, 400, 0.05, CandyType.GELATIN, FillingType.NOFILLING);
//        arr[2] = new Candy(25, 365, 0.2, CandyType.TOFFEE, FillingType.CREAM);
//        arr[3] = new Cake(36, 370, 0.3, CakeType.DONUT);
//        arr[4] = new Cake(80, 370, 0.3, CakeType.DONUT);
//        arr[5] = new Cake(70, 280, 0.1, CakeType.PIE);
//        arr[6] = new Cookie(45, 360, 0.1, CookieType.BISCUIT, CookieFilling.CHOCOLATE);
//        arr[7] = new Cookie(55, 420, 0.15, CookieType.SAND, CookieFilling.NUTS);
//        arr[8] = new Cookie(40, 460, 0.17, CookieType.SAND, CookieFilling.RAISINS);
//
//        return arr;
//    }

    public static Candy candyInitializator() throws SweetLogicException {
        //TODO сделать инициализацию из файла и вставить здесь же проверки на исключения
        //TODO сделать собственное исключение, на случай если вес и калорийность и процент сахара конфеты отрицательные
        int weight = 25 + (int) (Math.random() * 38);
        int caloric = 280 + (int) (Math.random() * 410);
        double sugarPercent = 0.1 + (double) (Math.random() * 0.2);
        if (weight <= 0 || caloric <= 0 || sugarPercent <= 0) {
            throw new SweetLogicException("weight/caloric/sugarPersent must be bigger than zero");
        }
        return new Candy(weight, caloric, sugarPercent, CandyType.next(), FillingType.next());
        //Integer [] candyValues = FileOutReader.readFromFile("files\\candy.txt");
        // return new Candy(candyValues[0], candyValues[1], candyValues[2], CandyType.next(), FillingType.next());
    }

    public static Cookie cookieInitializator() throws SweetLogicException {
        int weight = 30 + (int) (Math.random() * 40);
        int caloric = 310 + (int) (Math.random() * 410);
        double sugarPercent = 0.05 + (double) (Math.random() * 0.2);
        if (weight <= 0 || caloric <= 0 || sugarPercent <= 0) {
            throw new SweetLogicException("weight/caloric/sugarPersent must be bigger than zero");
        }
        return new Cookie(weight, caloric, sugarPercent, CookieType.next(), CookieFilling.next());

    }

    public static Cake cakeInitializator() throws SweetLogicException {
        int weight = 35 + (int) (Math.random() * 50);
        int caloric = 280 + (int) (Math.random() * 390);
        double sugarPercent = 0.05 + (double) (Math.random() * 0.2);
        if (weight <= 0 || caloric <= 0 || sugarPercent <= 0) {
            throw new SweetLogicException("weight/caloric/sugarPersent must be bigger than zero");
        }
        return new Cake(weight, caloric, sugarPercent, CakeType.next());

    }
}

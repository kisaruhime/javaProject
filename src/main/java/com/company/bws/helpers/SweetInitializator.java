package com.company.bws.helpers;

import com.company.bws.enums.*;
import com.company.bws.exceptions.SweetLogicException;
import com.company.bws.objects.Cake;
import com.company.bws.objects.Candy;
import com.company.bws.objects.Cookie;

public class SweetInitializator {


    public static Candy candyInitializator() throws SweetLogicException {
        int weight = 25 + (int) (Math.random() * 38);
        int caloric = 280 + (int) (Math.random() * 410);
        double sugarPercent = 0.1 + (double) (Math.random() * 0.2);
        if (weight <= 0 || caloric <= 0 || sugarPercent <= 0) {
            throw new SweetLogicException("Such values of weight, caloric and sugarPercent: " +weight + caloric + sugarPercent+ "are incorrect, all of them must be bigger than zero ");
        }
        return new Candy(weight, caloric, sugarPercent, CandyType.next(), FillingType.next());

    }

    public static Cookie cookieInitializator() throws SweetLogicException {
        int weight = 30 + (int) (Math.random() * 40);
        int caloric = 310 + (int) (Math.random() * 410);
        double sugarPercent = 0.05 + (double) (Math.random() * 0.2);
        if (weight <= 0 || caloric <= 0 || sugarPercent <= 0) {
            throw new SweetLogicException("Such values of weight, caloric and sugarPercent: " +weight + caloric + sugarPercent+ "are incorrect, all of them must be bigger than zero ");
        }
        return new Cookie(weight, caloric, sugarPercent, CookieType.next(), CookieFilling.next());

    }

    public static Cake cakeInitializator() throws SweetLogicException {
        int weight = 35 + (int) (Math.random() * 50);
        int caloric = 280 + (int) (Math.random() * 390);
        double sugarPercent = 0.05 + (double) (Math.random() * 0.2);
        if (weight <= 0 || caloric <= 0 || sugarPercent <= 0) {
            throw new SweetLogicException("Such values of weight, caloric and sugarPercent: " +weight + caloric + sugarPercent+ "are incorrect, all of them must be bigger than zero ");
        }
        return new Cake(weight, caloric, sugarPercent, CakeType.next());

    }
}

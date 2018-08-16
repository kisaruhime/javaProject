package com.company.bws.helpers;

import com.company.bws.exceptions.SweetLogicException;
import com.company.bws.objects.BagSweets;
import com.company.bws.objects.GiftWrapper;
import com.company.bws.objects.Sweet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CandyLoveWrapper implements GiftWrapper, Serializable {

    public CandyLoveWrapper() {
    }

    public BagSweets wrap() {
        int totalNum = 2 + (int) (Math.random() * 4);
        List<Sweet> sweets = new ArrayList<Sweet>();
        try {
            for (int i = 0; i < totalNum; i++) {
                sweets.add(SweetInitializator.candyInitializator());
            }
            sweets.add(SweetInitializator.cookieInitializator());
            sweets.add(SweetInitializator.cakeInitializator());
        } catch (SweetLogicException e) {
            System.out.println(e);
        }
        BagSweets newBag = new BagSweets();
        newBag.setBag(sweets);
        newBag.setWeight();
        return newBag;
    }
}

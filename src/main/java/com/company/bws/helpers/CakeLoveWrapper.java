package com.company.bws.helpers;

import com.company.bws.exceptions.SweetLogicException;
import com.company.bws.objects.BagSweets;
import com.company.bws.objects.GiftWrapper;
import com.company.bws.objects.Sweet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CakeLoveWrapper implements GiftWrapper, Serializable {

    public CakeLoveWrapper() {
    }

    public BagSweets wrap() {
        List<Sweet> sweets = new ArrayList<Sweet>();
        try {
            for (int i = 0; i < 3; i++) {
                sweets.add(SweetInitializator.cakeInitializator());
            }
            sweets.add(SweetInitializator.cookieInitializator());
            sweets.add(SweetInitializator.candyInitializator());
        } catch (SweetLogicException e) {
            System.out.println(e);
        }
        BagSweets newBag = new BagSweets();
        newBag.setBag(sweets);
        newBag.setWeight();
        return newBag;
    }


}

package com.company.bws.helpers;

import com.company.bws.objects.*;

public class CandyLoveWrapper implements GiftWrapper {

    public CandyLoveWrapper() {
    }

    @Override
    public BagSweets wrap() {
        int totalNum = 2 + (int) (Math.random() * 4);
        Sweet[] sweets = new Sweet[totalNum + 2];
        for (int i = 0; i < totalNum; i++) {
            sweets[i] = SweetInitializator.candyInitializator();
        }
        sweets[totalNum] = SweetInitializator.cookieInitializator();
        sweets[totalNum + 1] = SweetInitializator.cakeInitializator();
        BagSweets newBag = new BagSweets();
        newBag.setBag(sweets);
        newBag.setWeight();
        return newBag;
    }
}

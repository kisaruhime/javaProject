package com.company.bws.helpers;

import com.company.bws.objects.BagSweets;
import com.company.bws.objects.GiftWrapper;
import com.company.bws.objects.Sweet;

public class CakeLoveWrapper implements GiftWrapper {

    public static BagSweets wrap() {
        Sweet[] sweets = new Sweet[5];
        for (int i = 0; i < 3; i++) {
            sweets[i] = SweetInitializator.cakeInitializator();
        }
        sweets[3] = SweetInitializator.cookieInitializator();
        sweets[4] = SweetInitializator.candyInitializator();
        BagSweets newBag = new BagSweets();
        newBag.setBag(sweets);
        newBag.setWeight();
        return newBag;
    }
}
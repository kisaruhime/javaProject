package com.company.bws.helpers;

import com.company.bws.objects.BagSweets;
import com.company.bws.objects.GiftWrapper;
import com.company.bws.objects.Sweet;
import com.company.bws.objects.SweetLogicException;

public class CakeLoveWrapper implements GiftWrapper {

    public CakeLoveWrapper() {
    }

    @Override
    public  BagSweets wrap() {
        Sweet[] sweets = new Sweet[5];
        try {
            for (int i = 0; i < 3; i++) {
                sweets[i] = SweetInitializator.cakeInitializator();
            }
            sweets[3] = SweetInitializator.cookieInitializator();
            sweets[4] = SweetInitializator.candyInitializator();
        }
        catch (SweetLogicException e){
            System.out.println(e);
        }
        BagSweets newBag = new BagSweets();
        newBag.setBag(sweets);
        newBag.setWeight();
        return newBag;
    }
}

package com.company.bws.objects;

import com.company.bws.helpers.CakeLoveWrapper;
import com.company.bws.helpers.CandyLoveWrapper;

public class Stock {

    BagSweets[] bags;

    public BagSweets[] getBags() {
        return bags;
    }

    public void setBags(BagSweets[] bags) {
        this.bags = bags;
    }

    public Stock() {
        this.bags = new BagSweets[10];
    }

    public void initialixeStock (){
        for (int i =0;i<5;i++){
            this.bags[i] = CandyLoveWrapper.wrap();
            this.bags[i] = CakeLoveWrapper.wrap();
        }
    }


}

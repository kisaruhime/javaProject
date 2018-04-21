package com.company.bws.objects;

import com.company.bws.helpers.CakeLoveWrapper;
import com.company.bws.helpers.CandyLoveWrapper;

import java.util.Arrays;
import java.util.Objects;

public class Stock {

    private BagSweets[] bags;
    private GiftWrapper cakeWrapper;
    private GiftWrapper candyWrapper;

    public Stock() {
        this.bags = new BagSweets[10];
        this.candyWrapper = new CandyLoveWrapper();
        this.cakeWrapper = new CakeLoveWrapper();
    }

    public void initialixeStock() {
        for (int i = 0; i < 5; i++) {
            this.bags[i] = cakeWrapper.wrap();
            this.bags[i + 5] = candyWrapper.wrap();
        }
    }

    public BagSweets[] getBags() {
        return bags;
    }

    public void setBags(BagSweets[] bags) {
        this.bags = bags;
    }

    public GiftWrapper getCakeWrapper() {
        return cakeWrapper;
    }

    public void setCakeWrapper(CakeLoveWrapper cakeWrapper) {
        this.cakeWrapper = cakeWrapper;
    }

    public GiftWrapper getCandyWrapper() {
        return candyWrapper;
    }

    public void setCandyWrapper(CandyLoveWrapper candyWrapper) {
        this.candyWrapper = candyWrapper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Arrays.equals(bags, stock.bags) &&
                Objects.equals(cakeWrapper, stock.cakeWrapper) &&
                Objects.equals(candyWrapper, stock.candyWrapper);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(cakeWrapper, candyWrapper);
        result = 31 * result + Arrays.hashCode(bags);
        return result;
    }
}

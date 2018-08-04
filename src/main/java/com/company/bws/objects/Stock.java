package com.company.bws.objects;

import com.company.bws.helpers.CakeLoveWrapper;
import com.company.bws.helpers.CandyLoveWrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Stock implements Serializable {

    private List<BagSweets> bags;
    private GiftWrapper cakeWrapper;
    private GiftWrapper candyWrapper;

    public Stock() {
        this.bags = new ArrayList<BagSweets>();
        this.candyWrapper = new CandyLoveWrapper();
        this.cakeWrapper = new CakeLoveWrapper();
    }

    public void initialixeStock() {
        for (int i = 0; i < 5; i++) {
            bags.add(cakeWrapper.wrap());
            bags.add(candyWrapper.wrap());
        }
    }

    public List<BagSweets> getBags() {
        return bags;
    }

    public void setBags(List<BagSweets> bags) {
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
        return Objects.equals(bags, stock.bags) &&
                Objects.equals(cakeWrapper, stock.cakeWrapper) &&
                Objects.equals(candyWrapper, stock.candyWrapper);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bags, cakeWrapper, candyWrapper);
    }
}

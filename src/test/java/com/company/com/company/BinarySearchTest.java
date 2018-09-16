package com.company.com.company;

import com.company.bws.enums.CandyType;
import com.company.bws.enums.FillingType;
import com.company.bws.exceptions.SweetLogicException;
import com.company.bws.objects.*;
import com.company.bws.searchs.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.company.bws.enums.CakeType.CAKE;
import static com.company.bws.enums.CakeType.DONUT;
import static com.company.bws.enums.CookieFilling.CHOCOLATE;
import static com.company.bws.enums.CookieType.BISCUIT;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        Stock stock = new Stock();
        List<BagSweets> bags = new ArrayList<BagSweets>();
        List<Sweet> sweets_01 = new ArrayList<>();
        sweets_01.add(new Cake(46,641,0.2262602385079086,CAKE));
        sweets_01.add(new Cake(49,620,0.2262602385789634,DONUT));
        sweets_01.add(new Cookie(50,618,0.07573394081413345,BISCUIT,CHOCOLATE));
        List<Sweet> sweets_02 = new ArrayList<>();
        try {
            sweets_02.add(new Candy(51, 495, 0.2704417893526391, CandyType.CHOCOLATE, FillingType.CHOCOLATE));
        }catch (SweetLogicException e){
            e.printStackTrace();
        }
        sweets_02.add(new Cake(54,610,0.2262602385789634,DONUT));
        sweets_02.add(new Cookie(57,618,0.07573394081413345,BISCUIT,CHOCOLATE));

        bags.add(new BagSweets(sweets_01));
        bags.add(new BagSweets(sweets_02));
        stock.setBags(bags);

        Sweet sweet =  new Cake(48,620,0.2262602385789634,DONUT);

        Assert.assertEquals(BinarySearch.search(stock,sweet),false);


    }
}


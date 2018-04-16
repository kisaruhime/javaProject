package com.company.bws.helpers;

import com.company.bws.enums.*;
import com.company.bws.objects.Cake;
import com.company.bws.objects.Candy;
import com.company.bws.objects.Cookie;
import com.company.bws.objects.Sweet;

public class SweetInitializator {
    public static Sweet[] sweetsInitialize(Sweet[] arr) {
        arr[0] = new Candy(30, 450, 0.1, CandyType.CHOCOLATE, FillingType.CREAM);
        arr[1] = new Candy(20, 400, 0.05, CandyType.GELATIN, FillingType.NOFILLING);
        arr[2] = new Candy(25, 365, 0.2, CandyType.TOFFEE, FillingType.CREAM);
        arr[3] = new Cake(36, 370, 0.3, CakeType.DONUT);
        arr[4] = new Cake(80, 370, 0.3, CakeType.DONUT);
        arr[5] = new Cake(70, 280, 0.1, CakeType.PIE);
        arr[6] = new Cookie(45, 360, 0.1, CookieType.BISCUIT, CookieFilling.CHOCOLATE);
        arr[7] = new Cookie(55, 420, 0.15, CookieType.SAND, CookieFilling.NUTS);
        arr[8] = new Cookie(40, 460, 0.17, CookieType.SAND, CookieFilling.RAISINS);

        return arr;
    }
}

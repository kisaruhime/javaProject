package com.company;

public class SweetInitializator {
    public static Sweet[][] sweetsInitialize(Sweet[][] arr) {
        arr[0][0] = new Candy(20, 450, 0.1, Candy.CandyType.CHOCOLATE, Candy.FillingType.CREAM);
        arr[0][1] = new Candy(30, 400, 0.05, Candy.CandyType.GELATIN, Candy.FillingType.NOFILLING);
        arr[0][2] = new Candy(25, 365, 0.2, Candy.CandyType.TOFFEE, Candy.FillingType.CREAM);
        arr[1][0] = new Cake(36, 370, 0.3, Cake.CakeEnum.DONUT);
        arr[1][1] = new Cake(60, 370, 0.3, Cake.CakeEnum.DONUT);
        arr[1][2] = new Cake(70, 280, 0.1, Cake.CakeEnum.PIE);
        arr[2][0] = new Cookie(45, 360, 0.1, Cookie.CookieType.BISCUIT, Cookie.CookieFilling.CHOCOLATE);
        arr[2][1] = new Cookie(55, 420, 0.15, Cookie.CookieType.SAND, Cookie.CookieFilling.NUTS);
        arr[2][2] = new Cookie(40, 460, 0.17, Cookie.CookieType.SAND, Cookie.CookieFilling.RAISINS);

        return arr;
    }
}

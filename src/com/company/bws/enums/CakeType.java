package com.company.bws.enums;

public enum CakeType {

    DONUT, CAKE, PIE;

    CakeType() {
    }

    public static CakeType next() {
        return CakeType.values()[0 + (int) (Math.random() * 2)];

    }
}

package com.company.bws.enums;

public enum CookieFilling {

    RAISINS, NUTS, CHOCOLATE, NOFILLING;

    CookieFilling() {
    }

    public static CookieFilling next() {
        return CookieFilling.values()[0 + (int) (Math.random() * 3)];

    }
}

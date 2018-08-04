package com.company.bws.enums;

public enum CookieType {
    BISCUIT, SAND;

    CookieType() {
    }

    public static CookieType next() {
        return CookieType.values()[0 + (int) (Math.random() * 1)];

    }
}

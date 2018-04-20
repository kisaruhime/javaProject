package com.company.bws.enums;

public enum CandyType {
    CHOCOLATE, TOFFEE, GELATIN;

    CandyType() {
    }

    public static CandyType next() {
        return CandyType.values()[0 + (int) (Math.random() * 2)];

    }
}

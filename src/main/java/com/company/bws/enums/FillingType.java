package com.company.bws.enums;

public enum FillingType {
    CHOCOLATE, CREAM, AlCOHOL, NOFILLING;

    FillingType() {
    }

    public static FillingType next() {
        return FillingType.values()[0 + (int) (Math.random() * 3)];

    }
}

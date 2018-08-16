package com.company.bws.objects;

import com.company.bws.enums.CookieFilling;
import com.company.bws.enums.CookieType;

import java.util.Objects;

public class Cookie extends Sweet {

    private CookieType cookie;
    private CookieFilling filling;


    public Cookie() {

    }

    public Cookie(int weight, int caloric, double sugarPersent, CookieType cookie, CookieFilling filling) {
        super(weight, caloric, sugarPersent);
        this.cookie = cookie;
        this.filling = filling;
    }

    public CookieType getCookie() {
        return cookie;
    }

    public void setCookie(CookieType cookie) {
        this.cookie = cookie;
    }

    public CookieFilling getFilling() {
        return filling;
    }

    public void setFilling(CookieFilling filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "cookie=" + cookie +
                ", filling=" + filling +
                ", weight=" + this.getWeight() +
                ", caloric = " + this.getCaloric() +
                ", sugarPersent = " + this.getSugarPersent() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cookie cookie1 = (Cookie) o;
        return cookie == cookie1.cookie &&
                filling == cookie1.filling;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cookie, filling);
    }
}

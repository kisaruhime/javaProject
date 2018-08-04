package com.company.bws.helpers;

import com.company.bws.objects.Candy;
import com.company.bws.objects.Sweet;

public class SweetSugarSearch {
    public static void searchSweet(Sweet[] arr, int start, int end) {
        for (Sweet j : arr) {
            if (j.sugarWeight() >= start && j.sugarWeight() < end && j instanceof Candy) {
                System.out.println("Конфета " + j.toString() + "с содержанием сахара " + j.sugarWeight() + " соответствует заданному диапозону содержания сахара " + start + " - " + end);
            }
        }
    }
}

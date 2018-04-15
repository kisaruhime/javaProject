package com.company;

public class SweetSugarSearch {
    public static void searchSweet(Sweet[][] arr, int start, int end){
        for (Sweet [] i : arr){
            for(Sweet j: i){
                if(j.sugarWeight() >= start && j.sugarWeight() < end ){
                    System.out.println("Конфета "+ j.toString() + "с содержанием сахара "+ j.sugarWeight() + " соответствует заданному диапозону содержания сахара "+start +" - "+ end);
                }
            }
        }
    }
}

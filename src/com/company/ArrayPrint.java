package com.company;

public class ArrayPrint {
    public static void print(Sweet[][] arr){
        for(Sweet[] i: arr){
            for(Sweet j: i){
                System.out.println(j);
            }
        }
    }
}

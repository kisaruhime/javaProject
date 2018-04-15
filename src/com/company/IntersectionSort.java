package com.company;

public class IntersectionSort {

    public static void insertIntoSort(Sweet[][] arr1) {
        for (Sweet[] arr : arr1) {
            Sweet temp;
            int j;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getWeight() > arr[i + 1].getWeight()) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    j = i;
                    while (j > 0 && temp.getWeight() < arr[j - 1].getWeight()) {
                        arr[j] = arr[j - 1];
                        j--;
                    }
                    arr[j] = temp;
                }
            }
        }

    }
}

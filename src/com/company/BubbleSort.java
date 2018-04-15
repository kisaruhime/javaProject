package com.company;

public class BubbleSort {
    public static void sort(Sweet[][] arr1){
        for(Sweet[] arr: arr1){
            boolean swapped = true;
            for (int i = arr.length - 1; i > 0 && swapped; i--) {
                swapped = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j].getWeight() > arr[j + 1].getWeight()) {
                        Sweet temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        }
    }
}

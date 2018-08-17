package com.company.bws.sorts;

import com.company.bws.objects.BagSweets;
import com.company.bws.objects.Stock;
import com.company.bws.objects.Sweet;

import java.util.List;

public class QuickSort {

    public static List<Sweet> sweets;

    public static void quickSort(Stock stock) {
        List<BagSweets> bag = stock.getBags();
        for (BagSweets bag_sweets : bag) {
            sweets = bag_sweets.getBag();
            int startIndex = 0;
            int endIndex = sweets.size() - 1;
            doSort(startIndex, endIndex);
        }
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (sweets.get(i).getWeight() <= sweets.get(cur).getWeight())) {
                i++;
            }
            while (j > cur && (sweets.get(cur).getWeight()) <= sweets.get(j).getWeight()) {
                j--;
            }
            if (i < j) {
                Sweet temp = sweets.get(i);
                sweets.set(i, sweets.get(j));
                sweets.set(j, temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur + 1, end);
    }

}

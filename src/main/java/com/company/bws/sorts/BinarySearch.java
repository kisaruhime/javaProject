package com.company.bws.sorts;

import com.company.bws.objects.BagSweets;
import com.company.bws.objects.Stock;
import com.company.bws.objects.Sweet;

import java.util.List;

public class BinarySearch {

    public static List<Sweet> sweets;

    public static void search(Stock stock, Sweet sweet) {
        List<BagSweets> bag = stock.getBags();
        for (BagSweets bag_sweets : bag) {
            sweets = bag_sweets.getBag();
            int left = 0;
            int right = sweets.size();
            int k = BinarySearch_Rec(sweets, sweet, left, right);
            if (k > 0) {
                System.out.println("Element has been founded");
            } else {
                System.out.println("No such elemet in list");
            }
//            int start = 0;
//            int end = sweets.size() - 1;
//            while(start < end){
//                int middle = (end + start)/2;
//                if(sweets.get(middle).getWeight() >= sweet.getWeight()){
//                    end = middle;
//                }
//                else if(sweets.get(middle).getWeight() < sweet.getWeight()){
//                    start = middle +1;
//                }
//                else{
//                    if(sweets.get(middle).getCaloric() == sweet.getCaloric() && sweets.get(middle).getWeight() == sweet.getWeight()){
//                        return true;
//                    }
//                }
//            }
        }
        // return false;
    }


    static int BinarySearch_Rec(List<Sweet> sweets, Sweet sweet, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left >= right)
            return -(1 + left);

        if (sweets.get(mid).getWeight() == sweet.getWeight() && sweet.getCaloric() == sweets.get(mid).getCaloric()
                && sweet.getSugarPersent() == sweets.get(mid).getSugarPersent()
                && sweets.get(mid).getClass() == sweet.getClass())
            return mid;

        else if (sweets.get(mid).getWeight() > sweet.getWeight())
            return BinarySearch_Rec(sweets, sweet, left, mid);
        else
            return BinarySearch_Rec(sweets, sweet, mid + 1, right);
    }


}

package com.company.bws.sorts;

import com.company.bws.objects.Sweet;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
//    public static Sweet pivot;
//
//    public static List<Sweet> sort(List<Sweet> arr) {
//        if (arr.size() < 2)
//            return arr;
//        else
//            pivot = arr.get(0);
//        ArrayList<Sweet> less = new ArrayList<Sweet>() {
//            {
//                for (int i = 1; i < arr.size(); i++)
//                    if (comparatorLess(arr.get(i)) != null)
//                        add(arr.get(i));
//            }
//        };
//        ArrayList<Sweet> greater = new ArrayList<Sweet>() {
//            {
//                for (int i = 1; i < arr.size(); i++)
//                    if (comparatorMore(arr.get(i)) != null)
//                        add(arr.get(i));
//            }
//        };
//
//        //  less2.add(pivot);
//        return listCopy(sort(less),pivot,sort(greater));
//
//    }
//
//    private static Sweet comparatorLess(Sweet Sweet) {
//        if (Sweet.getWeight() < pivot.getWeight())
//            return Sweet;
//        else
//            return null;
//    }
//
//    private static Sweet comparatorMore(Sweet Sweet) {
//        if (Sweet.getWeight() > pivot.getWeight())
//            return Sweet;
//        else
//            return null;
//    }
//
//    private static List<Sweet> listCopy(List<Sweet> arr1, Sweet x, List<Sweet> arr2){
//        List<Sweet> newlist = arr1;
//        newlist.add(x);
//        return ListUtils.union(newlist,arr2);
//
//    }
}

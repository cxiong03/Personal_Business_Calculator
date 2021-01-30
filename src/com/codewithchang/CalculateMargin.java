package com.codewithchang;

public class CalculateMargin {

    static void margin(double sellingGoods, double costOfSellingGoods) {

        double margin = (sellingGoods - costOfSellingGoods) / sellingGoods;
        margin += margin * 100;

        System.out.println("\nSelling margin is: " + margin + "%");
    }
}

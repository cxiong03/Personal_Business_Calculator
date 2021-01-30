package com.codewithchang;

public class CalculateDiscount {

    static void discountDollarAmount(double priceOfItem, double discount) {
        double discountPercent = discount / 100;
        double markDown = priceOfItem * discountPercent;

        System.out.println("\nTotal dollar mark-down: $" + markDown);
    }

    static void markDownTotal(double priceOfItem, double discount) {
        double discountPoint = (100 - discount) / 100;
        double totalDiscount = priceOfItem * discountPoint;

        System.out.println("\nDiscounted price: $" + totalDiscount);

    }
}

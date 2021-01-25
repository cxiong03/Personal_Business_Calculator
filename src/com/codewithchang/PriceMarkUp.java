package com.codewithchang;

public class PriceMarkUp {

    static void markUpDollarAmount(double itemPrice, double points) {
        double markUp = itemPrice / points;

        System.out.println("Total dollar mark-up: $" + markUp);
    }

    static void markUpTotal(double itemPrice, double points) {
        double decimalPoint = (points / 100);
        double markUp = itemPrice * (decimalPoint + 1);

        System.out.println("New Price: $" + markUp);
    }
}

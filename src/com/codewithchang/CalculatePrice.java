package com.codewithchang;

import java.util.Scanner;

public class CalculatePrice {

    static void Price(double costOfGoods, double percentMargin) {

        Scanner scanner = new Scanner(System.in);
        double price = costOfGoods / (1 - (percentMargin / 100));
        System.out.println("\nPrice item: $" + price);
    }
}

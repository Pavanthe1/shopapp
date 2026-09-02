package com.example;

public class App {
    public double calculateDiscount(int amount) {
        if (amount >= 5000) {
            return amount * 0.20;
        } else if (amount >= 2000) {
            return amount * 0.10;
        } else {
            return 0;
        }
    }
}

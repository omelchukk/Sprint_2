package model.service;

import model.Food;
import model.Discountable;


public class ShoppingCart {
    private Food[] items = {};


    public void setItems(Food[] items) {
        this.items = items;
    }

    public double getPriceWithoutDiscount() {

        for (int i = 0; i < items.length; i++) {
            double total = 0.0;
           double total = items[i].getPrice() * items[i].getAmount();
        }
            return total;
    }
    public double getPriceWithDiscount() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            total = items[i].getPrice() * items[i].getAmount();
            double discount = items[i].getDiscount();
            total = double price * (1 - discount / 100);
        }
        return total;
    }

public double getVegetarianPriceWithoutDiscount() {
    double total = 0.0;
    for (int i = 0; i < items.length; i++) {
        if (items[i].isVegetarian()) {
            total = items[i].getPrice() * items[i].getAmount();
        }
    }
    return total;
}
}


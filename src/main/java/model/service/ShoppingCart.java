package model.service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items = new Food[0];

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getPriceWithoutDiscount() {
        double total = 0.0;

        for(int i = 0; i < items.length; i++) {
            Food item = items[i];
            total = item.getPrice() * (double)item.getAmount();
        }

        return total;
    }

    public double getPriceWithDiscount() {
        double total = 0.0;

        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double price = item.getPrice() * item.getAmount();
            double discount = item.getDiscount();

            total += price * (1.0 - discount / 100.0);
        }

        return total;
    }

    public double getVegetarianPriceWithoutDiscount() {
        double total = 0.0;

        for(int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()); {
                total = items[i].getPrice() * items[i].getAmount();
            }
        }

        return total;
    }
}


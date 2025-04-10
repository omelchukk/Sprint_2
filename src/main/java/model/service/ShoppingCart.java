package model.service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items = new Food[0];

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getPriceWithoutDiscount() {
        double total = (double)0.00;

        for(int i = 0; i < items.length; i++) {
            Food item = items[i];
            total = total + (item.getPrice() * item.getAmount());
        }

        return total;
    }

    public double getPriceWithDiscount() {
        double total = (double) 0.00;

        for (int i = 0; i < items.length; i++) {
            Food item = items[i];
            double price = item.getPrice() * item.getAmount();
            double discount = item.getDiscount();

            total = total + (price * ((double)1.00 - discount / (double)100.00));
        }

        return total;
    }

    public double getVegetarianPriceWithoutDiscount() {
        double total = (double)0.00;

        for(int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                total = total + (items[i].getPrice() * items[i].getAmount());
            }
        }

        return total;
    }
}


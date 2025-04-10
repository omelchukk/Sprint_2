package model;

import static model.constants.Discount.NO_DISCOUNT;

public class Meat extends Food implements Discountable {
    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }

    public double getDiscount() {
        return (NO_DISCOUNT);
    }
}
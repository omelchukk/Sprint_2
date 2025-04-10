package model;

import static model.constants.Discount.HAS_DISCOUNT;
import static model.constants.Discount.NO_DISCOUNT;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if ("red".equals(this.colour)) {
            return HAS_DISCOUNT;
        } else {
            return NO_DISCOUNT;
        }
    }
}
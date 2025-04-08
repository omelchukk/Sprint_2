package model;

import model.constants.Colour;
import model.constants.Discount;

public interface Discountable {
    public default double getDiscount() {
        return 0.0;
    }
}

class Meat implements Discountable {
    public double getDiscount() {
        return 0.0;
    }
}

class Apple implements Discountable {
    private String colour;

}
public Apple(String colour) {
    this.colour = colour;

    @Override
    public double getDiscount() {
        if (colour == Colour.RED) {
            return Discount.HAS_DISCOUNT;
        } else return Discount.NO_DISCOUNT;
    }
}
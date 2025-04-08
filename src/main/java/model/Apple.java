package model;

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
        if ("red".equals(colour)) {
        return 60.0;
        } else {
            return 0.0;
        }
    }
}
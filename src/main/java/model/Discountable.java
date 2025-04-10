package model;

public interface Discountable {
    default double getDiscount() {
        return (double)0.00;
    }
}

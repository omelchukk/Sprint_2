package model;


public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }
}

class Meat extends Food {

    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }
}

class Apple extends Food {
    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
    }
}





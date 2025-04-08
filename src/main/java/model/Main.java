package model;

import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

public class Main {


    public static void main(String[] args) {
        Food meat = new Meat(5, 100.00);
        Food redApple = new Apple(10, 50.00, "red");
        Food greenApple = new Apple(8, 60.00, "green");
        Food[] items = new Food[]{meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(items);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getPriceWithoutDiscount());
        System.out.println("Общая сумма товаров с скидкой " + shoppingCart.getPriceWithDiscount());
        System.out.println("Сумма всех вегетеринских продуктов без скидки :" + shoppingCart.getVegetarianPriceWithoutDiscount());
    }
}

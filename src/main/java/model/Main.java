package model;

import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.RED;
import static model.constants.Colour.GREEN;

public class Main {


    public static void main(String[] args) {
        Food meat = new Meat(5, 100.00);
        Food redApple = new Apple(10, 50.00, RED);
        Food greenApple = new Apple(8, 60.00, GREEN);
        Food[] items = new Food[]{meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(items);
        System.out.println(String.format("Общая сумма товаров без скидки: " + shoppingCart.getPriceWithoutDiscount()));
        System.out.println(String.format("Общая сумма товаров с скидкой " + shoppingCart.getPriceWithDiscount()));
        System.out.println(String.format("Сумма всех вегетеринских продуктов без скидки :" + shoppingCart.getVegetarianPriceWithoutDiscount()));
    }
}

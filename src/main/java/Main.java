import model.*;



public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100);
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");

        Food[] items = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + getPriceWithoutDiscount);
        System.out.println("Общая сумма товаров без скидки: " + getPriceWithDiscount);
        System.out.println("Сумма всех вегетеринских продуктов без скидки :" + getVegetarianPriceWithoutDiscount);
    }
}

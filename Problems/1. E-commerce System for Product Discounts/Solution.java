
interface Product {

    double getDiscount();
}

class Electronics implements Product {

    @Override
    public double getDiscount() {
        return 0.10;
    }
}

class Food implements Product {

    @Override
    public double getDiscount() {
        return 0.05;
    }
}

class DiscountCalculator {

    public double calculateDiscount(Product product, double price) {

        return price - (price * product.getDiscount());
    }
}

public class Solution {

    public static void main(String[] args) {

        DiscountCalculator discountCalculator = new DiscountCalculator();

        Product electonics = new Electronics();
        Product food = new Food();

        discountCalculator.calculateDiscount(electonics, 100);
        discountCalculator.calculateDiscount(food, 100);
    }

}

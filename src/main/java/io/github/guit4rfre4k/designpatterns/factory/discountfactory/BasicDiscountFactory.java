package io.github.guit4rfre4k.designpatterns.factory.discountfactory;

import io.github.guit4rfre4k.designpatterns.factory.discount.BasicDiscount;
import io.github.guit4rfre4k.designpatterns.factory.discount.Discount;

/**
 *
 * @author guit4rfre4k
 */
public class BasicDiscountFactory implements DiscountFactory {

    private static final Double SPECIAL_PRICE_FOR_100_DISCOUNT = 10.0;

    @Override
    public Discount createDiscount(Double price) {
        if (SPECIAL_PRICE_FOR_100_DISCOUNT.equals(price)) {
            return new Discount() {
                @Override
                public double getDiscountForPrice() {
                    return 1.0;
                }

                @Override
                public String getDiscountName() {
                    return "Extra 100% discount for everything for 10PLN!!!!";
                }
            };
        }
        return new BasicDiscount();
    }

}

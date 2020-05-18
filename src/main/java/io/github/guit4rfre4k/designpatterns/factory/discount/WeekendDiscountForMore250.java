package io.github.guit4rfre4k.designpatterns.factory.discount;

import io.github.guit4rfre4k.designpatterns.factory.discount.Discount;

/**
 *
 * @author guit4rfre4k
 */
public class WeekendDiscountForMore250 implements Discount {

    @Override
    public double getDiscountForPrice() {
        return 0.5;
    }

    @Override
    public String getDiscountName() {
        return "50% weekend for more than 250 PLN";
    }

}

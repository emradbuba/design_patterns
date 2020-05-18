package io.github.guit4rfre4k.designpatterns.factory.discount;

/**
 *
 * @author guit4rfre4k
 */
public class BasicDiscount implements Discount {

    @Override
    public double getDiscountForPrice() {
        return 0.1;
    }

    @Override
    public String getDiscountName() {
        return "Basic discount 10%";
    }

}

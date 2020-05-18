package io.github.guit4rfre4k.designpatterns.factory.discount;

/**
 *
 * @author guit4rfre4k
 */
public class WeekendDiscountBasic implements Discount {

    @Override
    public double getDiscountForPrice() {
        return 0.25;
    }

    @Override
    public String getDiscountName() {
        return "Weekend discount 25%";
    }

}

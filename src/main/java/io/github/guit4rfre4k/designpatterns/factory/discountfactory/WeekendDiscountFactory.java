package io.github.guit4rfre4k.designpatterns.factory.discountfactory;

import io.github.guit4rfre4k.designpatterns.factory.discount.WeekendDiscountForMore250;
import io.github.guit4rfre4k.designpatterns.factory.discount.Discount;
import io.github.guit4rfre4k.designpatterns.factory.discount.WeekendDiscountBasic;

/**
 *
 * @author guit4rfre4k
 */
public class WeekendDiscountFactory implements DiscountFactory {

    private static final Double LIMIT_50_PERCENT = 250.;

    @Override
    public Discount createDiscount(Double price) {
        if (price > LIMIT_50_PERCENT) {
            return new WeekendDiscountForMore250();
        } else {
            return new WeekendDiscountBasic();
        }
    }

}

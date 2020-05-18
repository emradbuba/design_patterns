package io.github.guit4rfre4k.designpatterns.factory.provider;

import io.github.guit4rfre4k.designpatterns.factory.discountfactory.BasicDiscountFactory;
import io.github.guit4rfre4k.designpatterns.factory.discountfactory.WeekendDiscountFactory;
import io.github.guit4rfre4k.designpatterns.factory.discountfactory.DiscountFactory;
import java.time.*;

/**
 *
 * @author guit4rfre4k
 */
public class DefaultDiscountFactoryProvider implements DiscountFactoryProvider {

    public DiscountFactory getFactory() {
        return isWeekend() ? new WeekendDiscountFactory() : new BasicDiscountFactory();
    }

    private boolean isWeekend() {
        LocalDate date = LocalDate.now();
        return date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

}

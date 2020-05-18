package io.github.guit4rfre4k.designpatterns.factory.discountfactory;

import io.github.guit4rfre4k.designpatterns.factory.discount.Discount;

/**
 *
 * @author guit4rfre4k
 */
public interface DiscountFactory {

    public Discount createDiscount(Double price);

}

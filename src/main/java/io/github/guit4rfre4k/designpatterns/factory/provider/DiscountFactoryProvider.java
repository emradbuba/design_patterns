package io.github.guit4rfre4k.designpatterns.factory.provider;

import io.github.guit4rfre4k.designpatterns.factory.discountfactory.DiscountFactory;

/**
 *
 * @author guit4rfre4k
 */
public interface DiscountFactoryProvider {

    public DiscountFactory getFactory();

}

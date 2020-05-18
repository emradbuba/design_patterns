package io.github.guit4rfre4k.designpatterns.factory.main;

import io.github.guit4rfre4k.designpatterns.factory.discountfactory.DiscountFactory;
import io.github.guit4rfre4k.designpatterns.factory.discount.Discount;
import io.github.guit4rfre4k.designpatterns.factory.provider.DiscountFactoryProvider;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guit4rfre4k
 */
public class Client {

    private final List<Double> listOfPrices = Arrays.asList(100., 50., 30., 500., 10.); // hard coded for demo
    private final DiscountFactory discountFactory;
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    static {
        LOGGER.setLevel(Level.INFO);
    }

    public Client(DiscountFactoryProvider discountFactoryProvider) {
        this.discountFactory = discountFactoryProvider.getFactory();
    }

    public Double getTotalPrice() {
        Double totalPrice = 0.0;
        for (Double oldPrice : listOfPrices) {
            final Discount discount = discountFactory.createDiscount(oldPrice);
            final Double reducedPrice = oldPrice - oldPrice * discount.getDiscountForPrice();
            if (!reducedPrice.equals(oldPrice)) {
                LOGGER.log(Level.INFO, "Using discount \"{0}\" for price {1} PLN --> {2}",
                        new Object[]{discount.getDiscountName(), oldPrice, reducedPrice});
            }
            totalPrice += reducedPrice;
        }
        return totalPrice;
    }

}

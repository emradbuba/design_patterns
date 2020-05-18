package io.github.guit4rfre4k.designpatterns.factory.main;

import io.github.guit4rfre4k.designpatterns.factory.provider.DefaultDiscountFactoryProvider;
import io.github.guit4rfre4k.designpatterns.factory.provider.DiscountFactoryProvider;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guit4rfre4k
 */
public class MainClass {

    private static final Logger LOGGER = Logger.getLogger(MainClass.class.getName());

    static {
        LOGGER.setLevel(Level.INFO);
    }

    public static void main(String[] args) {
        DiscountFactoryProvider discountFactoryProvider = new DefaultDiscountFactoryProvider();
        Client client = new Client(discountFactoryProvider);
        Double totalPrice = client.getTotalPrice();
        LOGGER.log(Level.INFO, "\n*******\nTotal price is: {0} PLN\n*******", totalPrice);
    }
}

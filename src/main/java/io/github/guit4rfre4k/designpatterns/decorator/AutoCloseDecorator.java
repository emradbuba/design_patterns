package io.github.guit4rfre4k.designpatterns.decorator;


import lombok.extern.slf4j.Slf4j;

/**
 * This decorator simulates a sample auto closable actions - actions which
 * should be executed in "try with resource" structure.
 * 
 * @author rmu
 */
@Slf4j
public class AutoCloseDecorator extends RouterDefaultDecorator {


	private static final String LOG_MESSAGE = "Performig the resource closing in AutoCloseable logic";

	public AutoCloseDecorator(Router router) {
		super(router);
	}

	@Override
	public void close() throws Exception {
		log.info(LOG_MESSAGE);
		super.close();
	}

}

package io.github.guit4rfre4k.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Main class for starting the decorator design pattern demo.
 * 
 * @author rmu
 */
@Slf4j
public class MainClassDecorator {


	/**
	 * A sample query to router without any particular sense - just for demo
	 * purposes.
	 */
	private static final String COMMAND_1 = "show routing table -r -t 5";
	/**
	 * A sample query to router without any particular sense - just for demo
	 * purposes.
	 */
	private static final String COMMAND_2 = "restart --force --no-quit";

	public static void main(String[] args) {
		try (Router router = new AutoCloseDecorator(new RouterCommandCapitalDecorator( // try with resources
				new RouterAutoDisconnectDecorator(new RouterAutoConnectDecorator(new BasicRouter("JuniperRouter")))))) {
			router.send(COMMAND_1);
			router.send(COMMAND_2);
			log.info(router.getRouterInfo());
		} catch (Exception e) {
			// Some logic performed in case of unexpected failures
		}
	}

}

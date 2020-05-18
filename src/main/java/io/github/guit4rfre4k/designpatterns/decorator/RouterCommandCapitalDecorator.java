package io.github.guit4rfre4k.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Router decorator transforming the entire send command to UPPERCASE before sending.
 * @author rmu
 *
 */
@Slf4j
public class RouterCommandCapitalDecorator extends RouterDefaultDecorator {

	public RouterCommandCapitalDecorator(Router router) {
		super(router);
	}

	@Override
	public void send(String command) {
		if(command != null) {
			log.info(String.format("Changing command \"%s\" to upper case...", command));
			command = command.toUpperCase();
		}
		super.send(command);
	}
	
	
	
	

}

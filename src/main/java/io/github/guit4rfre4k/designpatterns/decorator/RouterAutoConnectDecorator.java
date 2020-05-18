package io.github.guit4rfre4k.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Decorator responsible for ensure the auto connection before each send in
 * required.
 * 
 * @author rmu
 *
 */
@Slf4j
public class RouterAutoConnectDecorator extends RouterDefaultDecorator {

	public RouterAutoConnectDecorator(Router router) {
		super(router);
	}

	@Override
	public void send(String command) {
		connectIfDisconnected();
		super.send(command);
	}

	private void connectIfDisconnected() {
		if (!isConnected()) {
			super.connect();
		} else {
			log.info("Router already connected - no need to connect");
		}
	}

}

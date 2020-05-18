package io.github.guit4rfre4k.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * Decorator responsible for ensuring that router is always disconnected after
 * send.
 * 
 * @author rmu
 *
 */
@Slf4j
public class RouterAutoDisconnectDecorator extends RouterDefaultDecorator {

	public RouterAutoDisconnectDecorator(Router router) {
		super(router);
	}

	@Override
	public void send(String command) {
		super.send(command);
		disconnectIfConnected();
	}

	private void disconnectIfConnected() {
		if (isConnected()) {
			super.disconnect();
		} else {
			log.info("Router already disconnected - no need to disconnect");
		}
	}

}

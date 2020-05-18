package io.github.guit4rfre4k.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;
/**
 * A concrete class implementing a basic router.
 * 
 * @author rmu
 *
 */
@Slf4j
public class BasicRouter implements Router {

	private boolean isConnected = false;
	private final String routerName;

	
	public BasicRouter(String routerName) {
		this.routerName = routerName;
	}
	
	public void send(String command) {
		if(!isConnected) {
			log.error("Connection error - device not connected");
			return;
		}
		log.info("## Sending command \"" + command + "\" to the router");
		// TODO: Implement the real function of sending...
	}
	
	public void connect() {
		log.info(String.format("Connecting the %s router...", this.routerName));
		isConnected = true;
	}
	
	public void disconnect() {
		log.info(String.format("Disconnecting the %s router...", this.routerName));
		isConnected = false;
	}
	
	public boolean isConnected() {
		return this.isConnected;
	}

	public String getRouterInfo() {
		StringBuilder builder = new StringBuilder("\n================\nRouter info:")
				.append("\n\tDevice name: " + this.routerName)
				.append("\n\tConnection state: " + (isConnected ? "CONNECTED" : "DISCONNECTED"))
				.append("\n================");
		return builder.toString();
	}

	public void close() throws Exception {
		// no action here
	}

}

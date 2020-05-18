package io.github.guit4rfre4k.designpatterns.decorator;

/**
 * The default router decorator delegating all methods to the original router.
 * 
 * @author rmu
 *
 */
public abstract class RouterDefaultDecorator implements Router {

	protected final Router router;

	public RouterDefaultDecorator(Router router) {
		this.router = router;
	}

	public void send(String command) {
		router.send(command);
	}

	public void connect() {
		router.connect();
	}

	public void disconnect() {
		router.disconnect();
	}

	public boolean isConnected() {
		return router.isConnected();
	}

	public String getRouterInfo() {
		return router.getRouterInfo();
	}

	public void close() throws Exception {
	}
	
	

}

package io.github.guit4rfre4k.designpatterns.decorator;

/**
 * Interface representing a router functionality.
 * @author rmu
 *
 */
public interface Router extends AutoCloseable {
	
	public void send(String command);
	
	public void connect();
	
	public void disconnect();
	
	public boolean isConnected();
	
	public String getRouterInfo();

}

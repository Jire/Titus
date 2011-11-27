package titus;

import java.util.LinkedList;
import java.util.Queue;

public abstract class ApplicationFactory {

	private String host = "localhost";
	private int port = 43594;

	private final Queue<ApplicationSetting> settings = new LinkedList<ApplicationSetting>();

	protected void setHost(String host) {
		this.host = host;
	}

	protected void setPort(int port) {
		this.port = port;
	}

	protected void enableSetting(ApplicationSetting setting) {
		settings.add(setting);
	}

	protected abstract void configureApplication();

	Application build() {
		Application application = new Application(host, port);

		// Iterate through all of the settings and enable them in the application.
		while (settings.peek() != null) {
			application.enableSetting(settings.poll());
		}

		return application;
	}

}
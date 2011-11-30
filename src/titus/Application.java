package titus;

import titus.event.EventManager;
import titus.utility.setting.Settable;

public final class Application extends Settable<ApplicationSetting> {

	/*
	 * The static context of this class introduces a
	 * potential (very severe) issue of dynamic global state.
	 * 
	 * Use #setApplication with extreme care.
	 */

	private static Application application;

	static void setApplication(Application application) {
		Application.application = application;
	}

	public static Application getApplication() {
		return application;
	}

	// Non-static context delimiter

	private final String host;
	private final int port;

	private final EventManager eventManager = new EventManager();

	Application(String host, int port) {
		this.host = host;
		this.port = port;
	}

	String getHost() {
		return host;
	}

	int getPort() {
		return port;
	}

	public EventManager getEventManager() {
		return eventManager;
	}

	@Override
	protected void enableSetting(ApplicationSetting setting) {
		super.enableSetting(setting);
	}

	@Override
	protected void disableSetting(ApplicationSetting setting) {
		super.disableSetting(setting);
	}

}
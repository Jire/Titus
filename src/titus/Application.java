package titus;

import titus.utility.setting.Settable;

final class Application extends Settable<ApplicationSetting> {

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

	@Override
	protected void enableSetting(ApplicationSetting setting) {
		super.enableSetting(setting);
	}

	@Override
	protected void disableSetting(ApplicationSetting setting) {
		super.disableSetting(setting);
	}

}
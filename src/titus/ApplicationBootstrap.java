package titus;

public final class ApplicationBootstrap {

	private final ApplicationFactory factory;

	public ApplicationBootstrap(ApplicationFactory factory) {
		this.factory = factory;
	}

	public void initiate() {
		Application application = factory.build();

		// Sets the application singleton.
		Application.setApplication(application);

		// Iterate through the settings and run the initiative actions.
		for (ApplicationSetting setting : ApplicationSetting.values()) {
			if (application.isSettingEnabled(setting)) {
				setting.onApplicationInitiate(application);
			}
		}
	}

}
package titus;

import java.util.logging.Logger;

import titus.utility.Logging;

public final class ApplicationBootstrap {

	private static final Logger logger = Logging.getLogger();

	private final ApplicationFactory factory;

	public ApplicationBootstrap(ApplicationFactory factory) {
		this.factory = factory;
	}

	public void initiate() {
		logger.info("Initiating application...");

		Application application = factory.build();
		logger.info("Application built.");

		// Sets the application singleton.
		Application.setApplication(application);
		logger.info("Environment updated.");

		// Iterate through the settings and run the initiative actions.
		for (ApplicationSetting setting : ApplicationSetting.values()) {
			if (application.isSettingEnabled(setting)) {
				setting.onApplicationInitiate(application);
			}
		}
		logger.info("Updated application settings.");
	}

}
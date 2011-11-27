package test;

import titus.ApplicationFactory;
import titus.ApplicationSetting;

public class Factory extends ApplicationFactory {

	@Override
	protected void configureApplication() {
		setPort(43594);
		setHost("localhost");

		enableSetting(ApplicationSetting.DEBUG);
	}

}
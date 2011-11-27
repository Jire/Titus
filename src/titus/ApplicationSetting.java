package titus;

public enum ApplicationSetting {

	DEBUG;

	void onApplicationInitiate(Application application) {
		// Intended to be overridden.
	}

}
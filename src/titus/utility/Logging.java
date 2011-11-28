package titus.utility;

import java.util.logging.Logger;

public final class Logging {

	public static Logger getLogger() {
		// Retrieve the caller trace element from the system's thread's secondary element.
		StackTraceElement caller = Thread.currentThread().getStackTrace()[2];

		// Return back the Java API logger for the calling class name.
		return Logger.getLogger(caller.getClassName());
	}

}
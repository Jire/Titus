package titus.utility.setting;

import java.util.BitSet;

public abstract class Settable<T extends Enum<?>> {

	private final BitSet settings = new BitSet();

	protected BitSet getSettings() {
		return settings;
	}

	protected void enableSetting(T setting) {
		settings.set(setting.ordinal(), true);
	}

	protected void disableSetting(T setting) {
		settings.set(setting.ordinal(), false);
	}

	public boolean isSettingEnabled(T setting) {
		return settings.get(setting.ordinal());
	}

}
package titus.network;

public interface Protocol {

	Type getType();

	ProtocolDownHandler getDownHandler();
	ProtocolUpHandler getUpHandler();

	public static enum Type {

		REVISION_317(317),
		REVISION_474(474);

		private final int revision;

		Type(int revision) {
			this.revision = revision;
		}

		public int getRevision() {
			return revision;
		}

	}

}
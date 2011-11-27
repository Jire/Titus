package test;

import titus.ApplicationBootstrap;

public final class Loader {

	public static void main(String[] args) {
		ApplicationBootstrap bootstrap = new ApplicationBootstrap(new Factory());
		bootstrap.initiate();
	}

}
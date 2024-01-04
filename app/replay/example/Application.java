package replay.example;

import play.server.Starter;

public class Application {

	public static void main(String[] args) {
		Starter.start(System.getProperty("play.id", ""));
	}
}

package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
		driveDirect(150,200);
		sleep(5500);
		driveDirect(200,200);
		sleep(7000);
		driveDirect()
		

	}

	public void loop() {

	}
}

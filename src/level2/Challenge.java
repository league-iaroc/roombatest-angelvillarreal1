package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(200,200);
		sleep(6000);
		driveDirect(100,200);
		sleep(2000);
		driveDirect(200,200);
		sleep(3000);
		driveDirect(100,200);
		sleep(1000);
		driveDirect(200,200);
		sleep(9000);
		driveDirect(200,100);
		sleep(3000);
		driveDirect(200,200);
		
		
		
		
		
	}

	public void loop() {
	
	}
}

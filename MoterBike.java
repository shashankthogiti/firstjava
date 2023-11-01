package introductionToOOPS;

public class MoterBike {

	// state
	private int speed; // here speed is a member variable

	// behaviour
	// method
	// input - int speed; output - void; name - setSpeed;
	MoterBike() {
		this(5);
	}

	MoterBike(int speed) { // USING CONSTRUCTOR
		this.speed = speed;
	}


	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		if (this.speed - howMuch > 0) {
			this.speed = this.speed - howMuch;
		}
	}

}
//we wrote main method in 'MoterBikeRunner'
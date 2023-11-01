package introductionToOOPS;

public class MoterBikeRunner {

	public static void main(String[] args) {
		MoterBike duke = new MoterBike();
		MoterBike honda = new MoterBike();
		
		MoterBike somethingElse = new MoterBike();

		System.out.println(duke.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());

		duke.start();
		honda.start();

		duke.increaseSpeed(100);
		honda.increaseSpeed(100);

		duke.decreaseSpeed(250);
		honda.decreaseSpeed(250);

		System.out.println(duke.getSpeed());
		System.out.println(honda.getSpeed());

	}

}

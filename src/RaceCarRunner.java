
public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
		RaceCar r = new RaceCar("hari", 5);
		// 3. Get the RaceCar to print its position in the race.
		System.out.println(r.getPositionInRace());
		// 4. Crash the RaceCar
		r.crash();
		// 5. If the car is damaged. Bring it in for a pit stop.
		if (r.damaged == true) {
			r.pit();
		}

		// 6. Help the car move into first place.
		int p = r.getPositionInRace();
		for (int i = 0; i < p; i++) {
			r.overtake();
		}

	}
}

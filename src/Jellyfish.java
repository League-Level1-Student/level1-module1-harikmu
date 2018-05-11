
public class Jellyfish {
	int numberOfTentacles;
	String favoriteFood;

	Jellyfish(String favoriteFood, int numberOfTentacles) {
		this.favoriteFood = favoriteFood;
		this.numberOfTentacles = numberOfTentacles;
	}

	void swim() {
		System.out.println("Jellyfish is swimming");
	}

	void bubble() {
		System.out.println("*bubble*");
	}
}

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf h = new Smurf("Handy");
		h.eat();
		System.out.println(h.getName());
		Smurf p = new Smurf("Papa");
		System.out.println(p.getName());
		System.out.println(p.getHatColor());
		System.out.println(p.isGirlOrBoy());
		Smurf s = new Smurf("Smurfette");
		System.out.println(s.getName());
		System.out.println(s.getHatColor());
		System.out.println(s.isGirlOrBoy());
	}
}

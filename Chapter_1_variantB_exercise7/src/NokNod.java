
public class NokNod {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		NodCalc c = new NodCalc();
		System.out.println(c.gcd(a, b));
		System.out.println(c.lcm(a, b));
	}

}


public class Fibo {

	public static void main(String[] args) {
		Integer[] Numbers = new Integer[args.length];
		for(int i = 0; i<args.length; i++) {	
			Numbers[i] = Integer.parseInt(args[i]);
		}
		for(int i = 2; i<Numbers.length;i++) {
			if(Numbers[i] == Numbers[i-1] + Numbers[i-2]) {
				System.out.println(Numbers[i]);
			}
		}
		

	}

}

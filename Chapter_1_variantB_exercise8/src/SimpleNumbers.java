
public class SimpleNumbers {

	public static void main(String[] args) {
		Integer[] SimpleNumbers = new Integer[args.length];
		boolean v = true;
	
		for(int i = 0; i<args.length; i++) {	
			SimpleNumbers[i] = Integer.parseInt(args[i]);
		}
		
		for (int b = 0; b<SimpleNumbers.length; b++) {
			for(int j = 2; j<SimpleNumbers[b]; j++) {
				if (SimpleNumbers[b]%j==0) {
					v = false;
					break;
				}
			}
			if(SimpleNumbers[b] == 1) {
				System.out.println(SimpleNumbers[b]);
			}
			if(v) {
				System.out.println(SimpleNumbers[b]);
			} else {
				v = true;
			}
		}

	}

}

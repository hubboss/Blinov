import java.util.*;
public class EvenAndOdd {

	public static void main(String[] args) {
		System.out.println("������� ����� ����� ");
		Scanner scan = new Scanner(System.in);		
		
		Integer[] intNumbers = new Integer[5];
		for(int i=0; i<intNumbers.length; i++) {
			intNumbers[i] = scan.nextInt();
		}
		Integer[] odd = new Integer[intNumbers.length];
		Integer[] even = new Integer[intNumbers.length];
		for(int c=0; c<intNumbers.length; c++) {
			if(intNumbers[c]%2 == 0) {
				
				odd[c] = intNumbers[c];
				for(int j=0; j<odd.length; j++) {
					if(odd[j] == null) {
						continue;
					} else {
					System.out.print(odd[j]);
					}
				}
			} else if(!(intNumbers[c]%2 == 0)){
				
				even[c] = intNumbers[c];
				for(int b=0; b<even.length; b++) {
					if(even[b] == null) {
						continue;
					} else {
						System.out.print(even[b]);					
					}

				}
			}
			
			
			
		}
	}

}

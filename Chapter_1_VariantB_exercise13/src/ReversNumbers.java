
public class ReversNumbers {

	public static void main(String[] args) {
		char[] strToArray;
		boolean a = true;
		for (int i=0; i<args.length;i++) {
			strToArray = args[i].toCharArray(); // ����������� ������ str � ������ �������� (char)
			for(int c=strToArray.length-1; c >= 0 ; c--) {
				for(int k = 0;k<strToArray.length;k++) {
					if(strToArray[c]==strToArray[k]) {
						a = true;
					} else {
						a = false;
					}
				}
			}
			if (a) {
				System.out.println(args[i]);
			} else {
				a = true;
			}
		}
	}

}

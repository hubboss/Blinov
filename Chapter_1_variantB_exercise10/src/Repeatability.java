import java.util.ArrayList;

public class Repeatability {

	public static void main(String[] args) {
		Integer[] Numbers = new Integer[args.length];
		int count = 0;
		ArrayList counts = new ArrayList();
		for(int i = 0; i<args.length; i++) {	
			Numbers[i] = Integer.parseInt(args[i]);
		}
		
		
		/*�� ������� ����� ������������� ��� ������������
	      ��������� ������� (0 - ���������, 1-���������, 
	      2-���������,...)*/
	    for (int i = 0; i < Numbers.length; i++) {
	        /*������������, ��� ������ ������� (� ������
	           ������������ ���������) �������� ����������� */
	        int min = Numbers[i];
	        int min_i = i; 
	        /*� ���������� ����� ������������ ���� �������,
	           ������� ������ ��������������� ��������*/
	        for (int j = i+1; j < Numbers.length; j++) {
	            //���� �������, ���������� ��� ������
	            if (Numbers[j] < min) {
	                min = Numbers[j];
	                min_i = j;
	            }
	        }
	        /*���� ������� �������, �������, ��� �� ������� �������,
	          ������ �� �������*/
	        if (i != min_i) {
	            int tmp = Numbers[i];
	            Numbers[i] = Numbers[min_i];
	            Numbers[min_i] = tmp;
	        }
	        
	     }
	   /* for(int b = 0; b<Numbers.length; b++) {
      	System.out.println(Numbers[b] + ";");
      }*/
	    
	    for(int k = 0; k<Numbers.length; k++) {
	    	if (Numbers[k] == Numbers[k+1]) {
	    		count+=1;
	    	} else {
	    		counts.add(count + ":" + Numbers[k]);
	    		count = 0;
	    		
	    	}
	    }
	    for(int b = 0; b<counts.size(); b++) {
	      	System.out.println(counts.get(b) + ";");
	      }
	}

}
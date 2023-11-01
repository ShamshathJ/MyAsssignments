package Week2Day2;

public class ChangeOddChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "changeme";
	char [] charArray=name.toCharArray();
		
			for (int i = 0; i <name.length(); i++) {
			if (i%2 != 0) {
			//	char ch = charArray[i];
				charArray[i]= Character.toUpperCase(charArray[i]);
	           		
			}
			 System.out.print(charArray[i]);	           
			}
			
			
	}
			 
	}



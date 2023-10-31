package Week2Day1;



public class isPrime {
	
	public static void main(String[] args) {
		int num= 13;
		boolean flag = false;
		for (int i = 2; i <= num/2; ++i) {
		      // 
		      if (num%i == 0) {	        
		        flag = true;
		      }
		}
		      if (!flag)
		        System.out.println(num + " is a Prime number.");
		      
		        else
		          System.out.println(num + " is an  odd number.");
			

		      }
		
	}


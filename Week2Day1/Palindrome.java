package Week2Day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int inp = 12345;
int out = 0;
for(int i=inp;i>0;i=i/10) {
	int lastnum =i%10;
	out = (out*10)+ lastnum;
	
}
System.out.println(out);
	
	}

}

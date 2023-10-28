package week1Day2;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile msg = new Mobile();
		msg.makecall();
				
	}
	public void makecall()
	{
	String mobileModel = "iPhone";
	Float mobileweight = 100.1f;
	System.out.println("This is my Mobile  "+ mobileModel+ '\n' +"weight is "+ mobileweight);
	}
	
	public  void sendMessage() {
		boolean isFullCharged = true;
		int mobilecost = 1000;
		System.out.println("This is my Mobile  "+ isFullCharged+ '\n' +"weight is "+ mobilecost);	
	}

}

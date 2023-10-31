package Week2Day1;

public class Fibonacci {
	
	public static void main(String args[])  
	{    
	 int num1=0,num2=1,num3,i;    
	 System.out.print(num1+" "+num2);//printing 0 and 1    
	    
	 for(i=2;i<8;i++)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  num3=num1+num2;    
	  System.out.print(" "+num3);    
	  num1=num2;    
	  num2=num3;    
	 }    
	  
	}}  
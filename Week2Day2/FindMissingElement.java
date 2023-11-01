package Week2Day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,4,3,2,6};
		int sum= 0;
		for (int i = 0; i < num.length; i++) {
			//Arrays.sort(num);
			sum = sum+ num[i];
		}
		System.out.println(sum);
			int sum1=0;
			for (int j=1;j<=6;j++) {
				
				sum1 = sum1+j;
			
		}
			System.out.println(sum1);
		System.out.println("Missing number:"+(sum1-sum));
	}

}

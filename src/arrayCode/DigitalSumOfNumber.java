package arrayCode;

public class DigitalSumOfNumber {

	public static void main(String[] args) {

		int n=12345;
		
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int d=n%10;
				sum=sum+d;
				n=n/10;
			}
			n=sum;
		}
		System.out.println(n);
	}
}

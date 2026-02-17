package arrayCode;

public class MakeSumOfExpcetLastDigit {

	public static void main(String[] args) {

		int n=123;
		int s=0;
		while(n>10)
		{
			int d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println(s);
	}

}

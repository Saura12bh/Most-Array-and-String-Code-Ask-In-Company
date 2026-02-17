package arrayCode;

public class RevserGivenNumber {

	public static void main(String[] args) {
		int n=123;
		int rev=0;
		while(n>0)  
		{
			int d=n%10;  //3 2 1
			rev=rev*10+d; //3*10=320
			n=n/10;
		}
		System.out.println(rev);

	}
}

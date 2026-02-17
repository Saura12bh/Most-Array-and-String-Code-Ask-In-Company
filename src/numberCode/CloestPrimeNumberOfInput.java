package numberCode;

public class CloestPrimeNumberOfInput {

	public static void main(String[] args) {

		int n=10;
		int l=n-1;
		int r=n+1;
		
		while(true)
		{
			//for left side values checking
			boolean lp=true;
			for(int i=2;i<l;i++)
			{
				if(l%i==0)
				{
					lp=false;
					break;
				}
			}
			if(lp==true)
			{
				System.out.println(l);
				break;
			}
			
			//for right side checking
			boolean rp=true;
			for(int j=2;j<r;j++)
			{
				if(r%j==0)
				{
					rp=false;
					break;
				}
			}
			if(rp==true)
			{
				System.out.println(r);
				break;
			}
			l--;
			r++;
		}
	}
}

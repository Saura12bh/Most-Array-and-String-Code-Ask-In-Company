package arrayCode;

public class CountOfSumPairWithKelement {

	public static void main(String[] args) {

		int a[]={1,2,3,4,5,6};
		int s=5;
		int cnt=0;
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)//4+1=5  and 1+4= as donhi gheu nahi mhnun
			{
				if(a[i]+a[j]==s)
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}

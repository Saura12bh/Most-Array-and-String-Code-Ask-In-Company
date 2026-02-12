package arrayCode;

public class SumOfSubArrayWithKSum {

	public static void main(String[] args) {

		int a[]= {1,1,1,2,3};
		int k=3;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
				
				if(sum==k)
				{
					cnt++;
				}
			}
		
		}
		System.out.println(cnt);
	}
}

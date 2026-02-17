package arrayCode;

public class FindSecondSmallestElementFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int s=Integer.MAX_VALUE;
		int ss=Integer.MAX_VALUE;
		
		for(int i=0;i<5;i++)
		{
			if(a[i]<s)
			{
				ss=s;
				s=a[i];
			}
			else if(a[i]>s &&a[i]<ss)
			{
				ss=a[i];
			}
		}
		System.out.println(ss);
		System.out.println(s);


	}

}

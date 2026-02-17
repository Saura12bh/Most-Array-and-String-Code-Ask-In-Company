package arrayCode;

public class FindSecondMaxFromArray {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5};
		int m=Integer.MIN_VALUE;  //5 4 3 he second kadhich update honar nahi
		int sm=Integer.MIN_VALUE;
		
//		for(int i=0;i<5;i++)
//		{
//			if(a[i]>m)
//			{
//				m=a[i];
//			}
//		}
//		for(int i=0;i<5;i++)
//		{
//			if(a[i]<m&& a[i]>sm)
//			{
//				sm=a[i];
//			}
//		}
		for(int i=0;i<5;i++)
		{
			if(a[i]>m)
			{
				sm=m;
				m=a[i];
			}
			else if(a[i]<m&& a[i]>sm)
			{
				sm=a[i];
			}
		}
		System.out.println(m);

		System.out.println(sm);

	}

}

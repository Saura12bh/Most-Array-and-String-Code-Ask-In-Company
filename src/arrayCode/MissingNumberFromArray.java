package arrayCode;

public class MissingNumberFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,5,6,8};
		int m=a[0];
		int k=5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>m)
			{
				m=a[i];
			}
		}
		for(int i=1;i<=m;i++)
		{
			boolean b=true;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
//					System.out.println(i); yani jevdhe element ahe te print hotya
					b=false;
					break;
				}
			}
			if(b==true && i>k)  //check i element is not present must be greater than k
			{
				System.out.println(i);
				break;
			}
		}
	}
}

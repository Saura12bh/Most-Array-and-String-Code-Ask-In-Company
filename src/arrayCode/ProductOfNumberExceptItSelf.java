package arrayCode;

public class ProductOfNumberExceptItSelf {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};

		int res[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int p=1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)//selft nkoy
				{
					p=p*a[j];
				}
			}
			res[i]=p;
		}
		
		for(int i:res)
		{
			System.out.println(i);

		}
	}

}

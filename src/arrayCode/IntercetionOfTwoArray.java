package arrayCode;

import java.util.HashSet;

public class IntercetionOfTwoArray {
	public static void main(String x[])
	{
		int a[]= {1,2,3,4,5};
		int b[]= {2,3,4};
		
		HashSet<Integer> hm=new HashSet<Integer>();
		HashSet<Integer> res=new HashSet<Integer>();

		for(int i=0;i<a.length;i++)
		{
			hm.add(a[i]);
		}
		
		for(int ele:b)
		{
			if(hm.contains(ele))
			{
				res.add(ele);
			}
		}
		System.out.println(res);

	}
}

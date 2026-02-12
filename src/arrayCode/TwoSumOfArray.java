package arrayCode;

import java.util.HashMap;

public class TwoSumOfArray {

	public static void main(String x[])
	{
		int a[]={1,2,3,5,4};
		int t=4;
		//using for loop
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]+a[j]==t)
//				{
//					System.out.println(i+"\t"+j);
//					break;
//				}
//			}
//		}
		
		//using hash map
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			//need kadhun ghetli kiti number chi pahije tr tevdha no map madhe asel tr te 
			//print hotil
			int n=t-a[i];
			//need=4-2  ->2
			if(hm.containsKey(n))
			{
				System.out.println(hm.get(n)+"\t"+i);
				break;
			}
			hm.put(a[i],i);
		}

	}
}

package arrayCode;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubSequence {

	public static void main(String[] args) {
	int a[]= {100, 4, 200, 1, 3, 2};
	
	  Arrays.sort(a);//1,2,3,4
	  int len=1;
	  int cnt=1;
	  for(int i=1;i<a.length;i++)
	  {
		  if(a[i]==a[i-1]+1)  //2==a[i-1)->1 +1 =>2==2
		  {
			  cnt++;
		  }
		  else if(a[i]!=a[i-1])
		  {
			  cnt=1;   //cnt reset
		  }
		  //compare 
		  if(cnt>len)
		  {
			  len=cnt;
		  }
	  }
	  //he work krt nahi multipal  sequence asel tr 
//	  for(int i=0;i<a.length-1;i++)
//	  {
//		  if(a[i+1]==(a[i]+1)) //current element ha next element peksha yek ni motha ahe ka 
//		  {
//			  len++;
//		  }
//	  }
	
	HashSet<Integer> hm=new HashSet<Integer>();
	
	for(int i:a)
	{
		hm.add(i);
	}
	 
	 len=0;
	for(int n:a)  //100 4
	{
		if(!hm.contains(n-1))  //100 =>100-1 ->99 set madhe ahe ka
		{
			int curr=n; //100
			 cnt=1;
			while(hm.contains(curr+1))  //100+1  101->ahe ka  1+1=2
			{
				curr++;  //2
				cnt++;  //2
			}
			len=Math.max(cnt, len); //1,1
		}
	}
	
	  System.out.println(len);
	}
}

package arrayCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TopKfrequentElement {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,1,2,3,1,2,3};
		int k=2;
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int n:a)
		{
			Integer cnt=hm.get(n);
			if(cnt==null)
			{
				cnt=0;
			}
			cnt=cnt+1;
			hm.put(n,cnt);
		}
		
		Set<Map.Entry<Integer,Integer>> ent=hm.entrySet();
		for(Map.Entry<Integer,Integer> obj:ent)
		{
		   if(obj.getValue()>k)
		   {
			   System.out.println(obj.getKey());
		   }
		}

	}

}

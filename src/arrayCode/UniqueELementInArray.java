package arrayCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*8️) Single Number
Every element appears twice except one. Find that single one.
Example
Input: [4,1,2,1,2] → 4
*/
public class UniqueELementInArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,1,2,3,1,2,3};
//		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
//		for(int n:a)
//		{
//			Integer cnt=hm.get(n);
//			if(cnt==null)
//			{
//				cnt=0;
//			}
//			cnt=cnt+1;
//			hm.put(n,cnt);
//		}
//		
//		Set<Map.Entry<Integer,Integer>> ent=hm.entrySet();
//		for(Map.Entry<Integer,Integer> obj:ent)
//		{
//		   if(obj.getValue()==1)
//		   {
//			   System.out.println(obj.getKey());
//		   }
//		}
		
		//ptimized way
		//same element asel tr 0 hoto  adhi alela asel tr cancal ani nsel tr add hoto
		int res=0;
		for(int i:a)
		{
			res=res^i;
		}
		System.out.println(res);

	}
}

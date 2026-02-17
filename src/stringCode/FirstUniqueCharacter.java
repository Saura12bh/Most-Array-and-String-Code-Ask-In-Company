package stringCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		 String s = "leetcode";

	        // convert string into character array using split
	        char arr[] = s.toCharArray();

	        HashMap<Character,Integer> hm=new HashMap <Character,Integer>();
			for(char ch:arr)
			{
				Integer cnt=hm.get(ch);
				if(cnt==null)
				{
					cnt=0;
				}
				cnt=cnt+1;
				hm.put(ch,cnt);
			}
			
			Set<Entry<Character, Integer>> ent=hm.entrySet();
			for(Entry<Character, Integer> obj:ent)
			{
			   if(obj.getValue()==1)
			   {
				   System.out.println(obj.getKey());
				   
			   }
			}
	}

}
/*
 * public class FirstUniqueChar {
 * 
 * public static void main(String[] args) {
 * 
 * String s = "leetcode";
 * 
 * // convert string into character array using split String arr[] =
 * s.split("");
 * 
 * for (int i = 0; i < arr.length; i++) {
 * 
 * int count = 0;
 * 
 * for (int j = 0; j < arr.length; j++) { if (arr[i].equals(arr[j])) { count++;
 * } }
 * 
 * // if character appears only once if (count == 1) {
 * System.out.println(arr[i]); return; } }
 * 
 * // if no unique character System.out.println("_"); } }
 */
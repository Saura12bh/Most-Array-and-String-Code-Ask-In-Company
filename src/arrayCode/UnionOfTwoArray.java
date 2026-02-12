package arrayCode;

import java.util.HashSet;

public class UnionOfTwoArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int b[]= {2,3,4};
		
		HashSet<Integer> res1=new HashSet<>(); 
	
		for(int i:a)
		{
			res1.add(i);
		}
		for(int i:b)
		{
			res1.add(i);
		}
		System.out.println(res1);

	}
}

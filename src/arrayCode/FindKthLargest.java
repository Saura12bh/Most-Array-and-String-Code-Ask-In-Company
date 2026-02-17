package arrayCode;

public class FindKthLargest {

	public static void main(String[] args) {

		int a[]= {1,4,5,6,1,2};
		int k=3;
		for(int i=1;i<=k;i++)
		{
			int max=a[0],index=0;
			for(int j=1;j<a.length;j++)  //find the max from array 
			{
				if(a[j]>max)
				{
					max=a[j];
					index=j;     //jya location vrti max element sapla tyachi index ani remove krayla pn
				}
			}
			if(i==k)  //to iterator k iterations if k th time print answer 
			{
				System.out.println(max);
				break;
			}
			a[index]=Integer.MIN_VALUE;  //to remove max element that can be pick for another time
		}
	}

}

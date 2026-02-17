package arrayCode;

public class UniqueElementsFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,3,4};
		
		for(int i=0;i<a.length;i++)
		{
			boolean b=true;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j&&a[i]==a[j]) //i!=j do not compare your selfe 
				{
					b=false;
					break;  //after the finding dupliacte element stop the loop
				}
			}
			if(b==true)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}

}

package arrayCode;

public class RevserArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		int s=0,e=a.length-1;
		while(s<e)
		{
			int t=a[s];
			a[s]=a[e];
			a[e]=t;
			s++;
			e--;
		}
		for(int i:a)
		{
			System.out.println(i);

		}
	}

}

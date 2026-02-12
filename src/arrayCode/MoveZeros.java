package arrayCode;

public class MoveZeros {

	public static void main(String[] args) {

		int a[]={1,0,2,0,3,0};
//		int cnt=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]!=0)
//			{
//				a[cnt]=a[i];
//				cnt++;
//			}
//		}
//		for(int i=cnt;i<a.length;i++)
//		{
//			a[i]=0;
//		}
//		for(int n:a)
//		{
//			System.out.print("\t"+n);
//		}
//
		
		//using two pointer
		int left=0;
		for(int r=0;r<a.length;r++)
		{
			if(a[r]!=0)
			{
				int temp=a[left];
				a[left]=a[r];
				a[r]=temp;
				
				left++;
			}
		}
		for(int n:a)
		{
			System.out.print("\t"+n);

		}
	}

}

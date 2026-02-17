package arrayCode;

public class AddOneAtLastElement {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5};
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]<9)
			{
				a[i]=a[i]+1;  //jr last cha element is less than 9 asel tr 1 add hoyl ani break hoyl loop
				break;
			}
			else {
				a[i]=0;  //ani 9 asel tr 0 hoyl
			}
		}
		for(int i:a)
		{
			System.out.println(i);

		}
	}

}

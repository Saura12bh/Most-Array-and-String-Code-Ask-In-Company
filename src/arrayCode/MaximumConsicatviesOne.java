package arrayCode;

public class MaximumConsicatviesOne {

	public static void main(String[] args) {

		int a[]= {1,1,0,1,1,1};
		
		int cnt=0;
		int len=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)   //check  element is one or not
			{
				cnt++;   //make freq inc by one
				if(cnt>len)  //check prious max with current cnt
				{
					len=cnt; //if yes then replace with len
				}
			}
			else {
				cnt=0;  //if  othen than one then count become 0
			}
		}
		System.out.println(len);

	}
}

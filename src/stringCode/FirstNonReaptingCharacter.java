package stringCode;

public class FirstNonReaptingCharacter {

	public static void main(String[] args) {

		String s="omsairam";
		for(int i=0;i<s.length();i++)
		{
			boolean b=true;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				char ch1=s.charAt(j);
				if(i!=j && ch==ch1)
				{
					b=false;
					break;
				}
			}
			if(b==true)
			{
				System.out.println(ch);
				break;
			}
		}
	}

}

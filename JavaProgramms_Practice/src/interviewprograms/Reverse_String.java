package interviewprograms;

public class Reverse_String {

	public static void main(String[] args)
	{
		String actual_String = "santosh";
		String temp="";
		for(int i=actual_String.length()-1;i>=0;i--)
		{
			char y=actual_String.charAt(i);
			temp=temp+y;
		}
		System.out.println(temp);

	}
	
}

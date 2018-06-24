package interviewprograms;

public class Factorial_Prgm {

	public static void main(String[] args)
	{
		int value = 5;
		int temp =1;
		for(int i=1;i<=value;i++)
		{
			temp = temp*i;
		}
		
		System.out.println("= "+temp);
	}

}

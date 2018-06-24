package interviewprograms;

public class PowerofNnumber {

	public static void main(String[] args)
	{
		int value = 2;
		int n =5;
		int temp =1;
		for(int i=1;i<=n;i++)
		{
			temp=temp*value;
			System.out.println(temp);
		}
		System.out.println("Final value"+ temp);

	}

}

package interviewprograms;

public class Fibonacci_Series {

	public static void main(String[] args)
	{
		int x=0;
		int y=1;
		int temp=0;
		System.out.print(x+" "+y);
		for(int i=0;i<9;i++)
		{
			temp = x+y;
			x=y;
			y=temp;
			System.out.print(" "+temp);
		}
		

	}

}

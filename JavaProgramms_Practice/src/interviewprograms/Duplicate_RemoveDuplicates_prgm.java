package interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_RemoveDuplicates_prgm {

	
	public static void main(String[] args)
	{
		Duplicate_RemoveDuplicates_prgm d = new Duplicate_RemoveDuplicates_prgm();
		String[] arr = {"w10","w20","w10","w30","w20","w40","w50","w50"};
		d.dup(arr);
	}
	public void dup(String arr[]){
		ArrayList<String> arr2 = new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr2.indexOf(arr[i])==-1)
			{
				arr2.add(arr[i]);
			}
		}
		for(String s:arr2)
		{
			System.out.println("Exact values"+ s);
		}

	}
}

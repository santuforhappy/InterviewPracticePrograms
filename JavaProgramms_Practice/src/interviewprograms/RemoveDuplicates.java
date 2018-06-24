package interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public void sortArray(String arr[]){
		List<String> newArray = new ArrayList<String>();
		int count =0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i].equals(arr[j]))
				{
					count+=1;
				}
			}
			if(count<1)
			{
				newArray.add(arr[i]);
			}
			count =0;
		}
		
		for(int k=0;k<newArray.size();k++){
			System.out.println(newArray.get(k));
			
		}
//		for(String s : newArray){
//			System.out.println(s);
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates s = new RemoveDuplicates();
		String arra[]={"santosh","Temp","Santosh","Temp","then"};
		s.sortArray(arra);
	}

}

package interviewprograms;

import java.util.ArrayList;

public class SortingNumber_findingSecondHightNum {
	
	public void sorting(){
		Integer[] temparray = {2,8,6,4,4,7};
		ArrayList<Integer> pushinarray = new ArrayList<Integer>();
		int value;
		int count=0;
		for(int i=0;i<temparray.length;i++){
			for(int j=i+1;j<temparray.length;j++){
				if(temparray[i]>=temparray[j]){
					value = temparray[i];
					temparray[i]=temparray[j];
					temparray[j]=value;
				}
			}
		}
		for(int i:temparray){
			System.out.println(i);
		}
		for(int i=0;i<temparray.length;i++){
			for(int j=i+1;j<temparray.length;j++){
				if(temparray[i]==temparray[j]){
					count+=1;
				}
			}
			if(count<1){
				pushinarray.add(temparray[i]);
			}
			count=0;
		}
		for(int i: pushinarray){
			System.out.println("Unique array value"+ i);
		}
		int totalcount = pushinarray.size();
		System.out.println(pushinarray.get(totalcount-2));
	}

	public static void main(String[] args) {
		
		SortingNumber_findingSecondHightNum s = new SortingNumber_findingSecondHightNum();
		s.sorting();

	}

}
